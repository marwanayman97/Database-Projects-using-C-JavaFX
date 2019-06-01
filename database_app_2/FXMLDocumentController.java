/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareeqi;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

/**
 *
 * @author 
	Marwan Ayman 17107676
	Al-Farouk Ahmed 17107672
	Ahmed Salem  17107813
	Ahmed Samy  17107763
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button dbconnect;
    @FXML
    private ImageView bgmain;
    @FXML
    private TextField pass;
    @FXML
    private TextField fname;
    @FXML
    private TextField lname;
    @FXML
    private Button adduser;
    @FXML
    private RadioButton prt;
    @FXML
    private TextField userid;
    @FXML
    private RadioButton drv;
    @FXML
    private ToggleGroup choice;
    @FXML
    private TextField tripid;
    @FXML
    private Button gettripdata;
    @FXML
    private Button gettripdetails;
    @FXML
    private ComboBox unis;
    @FXML
    private Button getinstdetails;
    @FXML
    private Button getuserdata;
    @FXML
    private TextArea msgs;
    @FXML
    private Button clr;
    @FXML
    private TextField numuser;
    
        Connection myconn = null;
        Statement mystat = null;
        ResultSet myrs = null;
        Date now = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("[dd/MM/yyyy hh:mm:ss a] ");
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    public void connectdb(){
        try {
            
            myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/track", "cms_admin", "cms_admin");
            msgs.appendText(ft.format(now) + "Database connected successfully !\n");
            dbconnect.setVisible(false);
            
        } catch (SQLException ex) {
            msgs.appendText(ex.getMessage());
        }
        
            try{
             String query5 = "SELECT Name from institution";

             mystat = myconn.createStatement();

             myrs = mystat.executeQuery(query5);

            
            while (myrs.next())
            {
             unis.getItems().add(myrs.getString("Name"));
            }
            
            unis.setValue("Please select institution name");
            
            }catch(SQLException ex){
                msgs.appendText(ex.getMessage());
            }
}

    @FXML
    public void getuserdata(){
            
             String fn="",ln="",phone="";
             
             int useridval=0;
             try{ useridval = Integer.parseInt(userid.getText());
             
                 try{
            String query1 = "SELECT FirstName,LastName,PhoneNumber FROM user WHERE ID = "+useridval+"";

            Statement st = myconn.createStatement();

            ResultSet rs = st.executeQuery(query1);

            int counter = 0;
            while (rs.next())
            {
               counter++;
              
            }
            
            if(counter==0){
                msgs.appendText("User with such ID doesn't exist !\n");
            }else{
            
                try{
            String query2 = "SELECT FirstName,LastName,PhoneNumber FROM user WHERE ID = "+Integer.parseInt(userid.getText())+"";

             st = myconn.createStatement();

             rs = st.executeQuery(query2);

            
            while (rs.next())
            {
              
              fn = rs.getString("FirstName");
              ln = rs.getString("LastName");
              phone = rs.getString("PhoneNumber");
              
              
            }
            
            msgs.appendText("Name is: " + fn + " " +ln + " & Phone number is: " + phone + "\n");
            
            }catch(SQLException ex){
                 msgs.appendText(ex.getMessage());
            }
            }
            
            
            }catch(SQLException ex){
                 msgs.appendText(ex.getMessage());
            }
             
             }
             catch(NumberFormatException ex){
                 msgs.appendText("Invalid ID entered, numbers only are allowed !\n");
             }
             
           
             
            
    }
    
    @FXML
    public void gettripstations(){
        
           String stt="";
             
             int tripidx=0;
             try{ tripidx = Integer.parseInt(tripid.getText());
             
                 try{
            String query1 = "SELECT StationName from Trip_Has_Stations INNER JOIN Station ON Trip_Has_Stations.Station_ID = Station.Station_ID WHERE Trip_Has_Stations.Trip_ID = "+tripidx+" ORDER BY Station_Order ASC";

            Statement st = myconn.createStatement();

            ResultSet rs = st.executeQuery(query1);

            int counter = 0;
            while (rs.next())
            {
               counter++;
              
            }
            
            if(counter==0){
                msgs.appendText("Trip with such ID doesn't exist !\n");
            }else{
            
                try{
            String query2 = "SELECT StationName from Trip_Has_Stations INNER JOIN Station ON Trip_Has_Stations.Station_ID = Station.Station_ID WHERE Trip_Has_Stations.Trip_ID = "+tripidx+" ORDER BY Station_Order ASC";

             st = myconn.createStatement();

             rs = st.executeQuery(query2);

            int cnt =1;
            while (rs.next())
            {
              
              stt = rs.getString("StationName");
              
              msgs.appendText("Station " + cnt + " is:\t" + stt + "\n");
              
              cnt++;
              
            }
            
            cnt=0;
            
            }catch(SQLException ex){
                 msgs.appendText(ex.getMessage());
            }
            }
            
            
            }catch(SQLException ex){
                 msgs.appendText(ex.getMessage());
            }
             
             }
             catch(NumberFormatException ex){
                 msgs.appendText("Invalid ID entered, numbers only are allowed !\n");
             }
             
           
    }
    
    @FXML
    public void gettripdetails(){
         
        String type="",num="";
        Time tm;     
             int tripidx=0;
             try{ tripidx = Integer.parseInt(tripid.getText());
             
                 try{
            String query1 = "SELECT Type,Time,PhoneNumber from trip WHERE Trip_ID = "+tripidx+"";

            Statement st = myconn.createStatement();

            ResultSet rs = st.executeQuery(query1);

            int counter = 0;
            while (rs.next())
            {
               counter++;
              
            }
            
            if(counter==0){
                msgs.appendText("Trip with such ID doesn't exist !\n");
            }else{
            
                try{
            String query2 = "SELECT Type,Time,PhoneNumber from trip WHERE Trip_ID = "+tripidx+"";

             st = myconn.createStatement();

             rs = st.executeQuery(query2);

            
            while (rs.next())
            {
              type = rs.getString("Type");
              num = rs.getString("PhoneNumber");
              tm = rs.getTime("Time");
              
              msgs.appendText("It is a "+ type + " trip, departing at " + tm + "\nThe trip's Driver mobile number is: " + num + "\n" );
             }
            
            
            
            }catch(SQLException ex){
                 msgs.appendText(ex.getMessage());
            }
            }
            
            
            }catch(SQLException ex){
                 msgs.appendText(ex.getMessage());
            }
             
             }
             catch(NumberFormatException ex){
                 msgs.appendText("Invalid ID entered, numbers only are allowed !\n");
             }
    }
    
    @FXML
    public void getinstitutiondetails(){
        
        String choiceuni = unis.getValue().toString();
        
        try{
            String query1 = "SELECT Name,Location,PhoneNumber from institution WHERE Name = '"+choiceuni+"'";

            Statement st = myconn.createStatement();

            ResultSet rs = st.executeQuery(query1);

            int counter = 0;
            while (rs.next())
            {
               counter++;
              
            }
            
            if(counter==0){
                msgs.appendText("Institution with such name doesn't exist !\n");
            }else{
            
                try{
            String query2 = "SELECT Name,Location,PhoneNumber from institution WHERE Name = '"+choiceuni+"'";

             st = myconn.createStatement();

             rs = st.executeQuery(query2);

            
            while (rs.next())
            {
              String instname = rs.getString("Name");
              String loc = rs.getString("Location");
              String instnum = rs.getString("PhoneNumber");
              
              msgs.appendText("Institution named " + instname + " is located in " + loc + " and their mobile number is: " + instnum + "\n" );
             }
            
            
            
            }catch(SQLException ex){
                 msgs.appendText(ex.getMessage()+"\n");
            }
            }
            
            
            }catch(SQLException ex){
                 msgs.appendText(ex.getMessage());
            }
             
             
        
    }
    
    public void addnewuser(){
        if(numuser.getText()=="" || pass.getText()=="" || fname.getText()=="" || lname.getText()=="" || (drv.isSelected()==false && prt.isSelected()==false)){
            msgs.appendText("Please fill in all required fields !\n");
        }else{
            try{
            String query7 = "SELECT ID from user WHERE PhoneNumber = '"+numuser.getText()+"'";

            Statement st = myconn.createStatement();

            ResultSet rs = st.executeQuery(query7);

            int counter = 0;
            while (rs.next())
            {
               counter++;
               
            }
            
            if(counter > 0){
                msgs.appendText("User with such mobile number is already registered, please try another number !\n");
                numuser.setText("");
            }else{
            
            String query = "INSERT INTO user (ID, PhoneNumber,Password,FirstName,LastName) VALUES (NULL, ?, ?, ?,? )";
            PreparedStatement preparedStmt = myconn.prepareStatement(query);
            preparedStmt.setString(1, numuser.getText());
            preparedStmt.setString(2, pass.getText());
            preparedStmt.setString(3, fname.getText());
            preparedStmt.setString(4, lname.getText());
            preparedStmt.execute();
            
            if(drv.isSelected()){
            
            int iddrv=0;
                
            String query8 = "SELECT ID from user WHERE PhoneNumber = '"+numuser.getText()+"'";

            Statement st8 = myconn.createStatement();

            ResultSet rs2 = st8.executeQuery(query8);

            
            while (rs2.next())
            {
               
                iddrv = rs2.getInt("ID");
            }
            
            String qry = "INSERT INTO driver (Driver_ID, PhoneNumber) VALUES (?, ?)";
            PreparedStatement preparedStm = myconn.prepareStatement(qry);
            
            preparedStm.setInt(1, iddrv);
            preparedStm.setString(2, numuser.getText());
            preparedStm.execute();
            
            }else if(prt.isSelected()){
                
            int idprt=0;    
            String query9 = "SELECT ID from user WHERE PhoneNumber = '"+numuser.getText()+"'";

            Statement st8 = myconn.createStatement();

            ResultSet rs2 = st8.executeQuery(query9);

            
            while (rs2.next())
            {
               
                idprt = rs2.getInt("ID");
            }
            
            String qry = "INSERT INTO parent (Parent_ID, PhoneNumber) VALUES (?, ?)";
            PreparedStatement preparedStm = myconn.prepareStatement(qry);
            
            preparedStm.setInt(1, idprt);
            preparedStm.setString(2, numuser.getText());
            preparedStm.execute();
                
            }
            
            msgs.appendText(ft.format(now) + "User successfully added !\n");
            numuser.setText("");
            pass.setText("");
            fname.setText("");
            lname.setText("");
            drv.setSelected(false);
            prt.setSelected(false);
            }
        }catch(SQLException e){
            msgs.appendText(e.getMessage()+"\n");
        }
    }
    }
    
    @FXML
    public void cleartxtlog(){
        msgs.setText("");
    }
}
