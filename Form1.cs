using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;



namespace Database_App
{

    public partial class Form1 : Form
    {

        public Form1()
        {
            InitializeComponent();
            
        }



        private void button1_Click(object sender, EventArgs e)
        {
            String now = DateTime.Now.ToString("MM/dd/yyyy hh:mm:ss tt");
            string connetionString;
            SqlConnection cnn;
            connetionString = @"Data Source=MARWAN-PC\SQLEXPRESS;Initial Catalog=TRACK;User ID=sa;Password=ahmed";
            cnn = new SqlConnection(connetionString);
            cnn.Open();
            tb1.AppendText("["+ now + "] " + "Database Connected Successfully !\n");

            SqlCommand cmd;
            SqlDataReader dreader;
            String query, output = "";

            query = "Select Name from Institution";

            cmd = new SqlCommand(query, cnn);
            
            dreader = cmd.ExecuteReader();

            while (dreader.Read())
            {
                output = dreader.GetString(0);
                cb1.Items.Add(output);
            }

            button1.Enabled = false;
            dreader.Close();
            cmd.Dispose();
            cnn.Close();
            
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void getinstdet_Click(object sender, EventArgs e)
        {
            
            string connetionString;
            SqlConnection cnn;
            connetionString = @"Data Source=MARWAN-PC\SQLEXPRESS;Initial Catalog=TRACK;User ID=sa;Password=ahmed";
            cnn = new SqlConnection(connetionString);
            cnn.Open();
            

            SqlCommand cmd;
            SqlDataReader dreader;
            String query, output = "";

            query = "Select Name,Location,PhoneNumber from Institution where Name = @instname";

           
            cmd = new SqlCommand(query, cnn);
            cmd.Parameters.AddWithValue("@instname", cb1.SelectedItem);

            dreader = cmd.ExecuteReader();

            while (dreader.Read())
            {
                output = "Institution Name is: " + dreader.GetString(0) + Environment.NewLine + "Institution is located in " + dreader.GetString(1) + Environment.NewLine + "Institution Mobile Number is: " + dreader.GetString(2) + Environment.NewLine;
                tb1.AppendText(output);
            }

           
            dreader.Close();
            cmd.Dispose();
            cnn.Close();
        }

        private void getdriverdet_Click(object sender, EventArgs e)
        {
            string connetionString;
            SqlConnection cnn;
            connetionString = @"Data Source=MARWAN-PC\SQLEXPRESS;Initial Catalog=TRACK;User ID=sa;Password=ahmed";
            cnn = new SqlConnection(connetionString);
            cnn.Open();


            SqlCommand cmd;
            SqlDataReader dreader;
            String query, output = "";

            query = "SELECT FirstName,LastName,[User].PhoneNumber from [User] FULL OUTER JOIN Driver_Drives_Bus ON [User].ID = Driver_Drives_Bus.Driver_ID WHERE Driver_Drives_Bus.PlateNumber = @platenum";


            cmd = new SqlCommand(query, cnn);
            cmd.Parameters.AddWithValue("@platenum", tb2.Text);

            dreader = cmd.ExecuteReader();

            while (dreader.Read())
            {
                output = "Driver Name is: " + dreader.GetString(0) +" "+ dreader.GetString(1) + Environment.NewLine + "Driver Mobile Number is: " + dreader.GetString(2) + Environment.NewLine;
                tb1.AppendText(output);
            }

            
            dreader.Close();
            cmd.Dispose();
            cnn.Close();
        }

        private void getripstations_Click(object sender, EventArgs e)
        {
            string connetionString;
            SqlConnection cnn;
            connetionString = @"Data Source=MARWAN-PC\SQLEXPRESS;Initial Catalog=TRACK;User ID=sa;Password=ahmed";
            cnn = new SqlConnection(connetionString);
            cnn.Open();


            SqlCommand cmd;
            SqlDataReader dreader;
            String query, output = "";

            query = "SELECT StationName from Trip_Has_Stations FULL OUTER JOIN Station ON Trip_Has_Stations.Station_ID = Station.Station_ID WHERE Trip_Has_Stations.Trip_ID = @tid ORDER BY Station_Order ASC";


            cmd = new SqlCommand(query, cnn);
            cmd.Parameters.AddWithValue("@tid", tb3.Text);

            dreader = cmd.ExecuteReader();

            int i = 0;

            while (dreader.Read())
            {
                
                i++;
                output = "Station " + i + " is: "  + dreader.GetString(0) + Environment.NewLine ;
                tb1.AppendText(output);
                
            }


            dreader.Close();
            cmd.Dispose();
            cnn.Close();
        }
    }
}
