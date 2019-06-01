namespace Database_App
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.button1 = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.getdriverdet = new System.Windows.Forms.Button();
            this.getinstdet = new System.Windows.Forms.Button();
            this.getripstations = new System.Windows.Forms.Button();
            this.tb2 = new System.Windows.Forms.TextBox();
            this.tb3 = new System.Windows.Forms.TextBox();
            this.cb1 = new System.Windows.Forms.ComboBox();
            this.tb1 = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.BackColor = System.Drawing.Color.Tomato;
            this.button1.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button1.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(64)))), ((int)(((byte)(64)))));
            this.button1.Location = new System.Drawing.Point(501, 48);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(123, 41);
            this.button1.TabIndex = 0;
            this.button1.Text = "Connect Database";
            this.button1.UseVisualStyleBackColor = false;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::Database_App.Properties.Resources.tareeqi;
            this.pictureBox1.Location = new System.Drawing.Point(12, 12);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(355, 77);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 1;
            this.pictureBox1.TabStop = false;
            // 
            // getdriverdet
            // 
            this.getdriverdet.BackColor = System.Drawing.Color.SteelBlue;
            this.getdriverdet.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.getdriverdet.Location = new System.Drawing.Point(267, 174);
            this.getdriverdet.Name = "getdriverdet";
            this.getdriverdet.Size = new System.Drawing.Size(123, 41);
            this.getdriverdet.TabIndex = 2;
            this.getdriverdet.Text = "Get Bus Driver Details";
            this.getdriverdet.UseVisualStyleBackColor = false;
            this.getdriverdet.Click += new System.EventHandler(this.getdriverdet_Click);
            // 
            // getinstdet
            // 
            this.getinstdet.BackColor = System.Drawing.Color.SeaGreen;
            this.getinstdet.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.getinstdet.ForeColor = System.Drawing.Color.Black;
            this.getinstdet.Location = new System.Drawing.Point(36, 174);
            this.getinstdet.Name = "getinstdet";
            this.getinstdet.Size = new System.Drawing.Size(123, 41);
            this.getinstdet.TabIndex = 3;
            this.getinstdet.Text = "Get Institution Details";
            this.getinstdet.UseVisualStyleBackColor = false;
            this.getinstdet.Click += new System.EventHandler(this.getinstdet_Click);
            // 
            // getripstations
            // 
            this.getripstations.BackColor = System.Drawing.Color.Yellow;
            this.getripstations.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.getripstations.Location = new System.Drawing.Point(501, 174);
            this.getripstations.Name = "getripstations";
            this.getripstations.Size = new System.Drawing.Size(123, 41);
            this.getripstations.TabIndex = 4;
            this.getripstations.Text = "Get Trip Stations";
            this.getripstations.UseVisualStyleBackColor = false;
            this.getripstations.Click += new System.EventHandler(this.getripstations_Click);
            // 
            // tb2
            // 
            this.tb2.Location = new System.Drawing.Point(267, 130);
            this.tb2.Name = "tb2";
            this.tb2.Size = new System.Drawing.Size(119, 20);
            this.tb2.TabIndex = 6;
            // 
            // tb3
            // 
            this.tb3.Location = new System.Drawing.Point(501, 130);
            this.tb3.Name = "tb3";
            this.tb3.Size = new System.Drawing.Size(119, 20);
            this.tb3.TabIndex = 7;
            // 
            // cb1
            // 
            this.cb1.FormattingEnabled = true;
            this.cb1.Location = new System.Drawing.Point(36, 130);
            this.cb1.Name = "cb1";
            this.cb1.Size = new System.Drawing.Size(121, 21);
            this.cb1.TabIndex = 8;
            // 
            // tb1
            // 
            this.tb1.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.tb1.Location = new System.Drawing.Point(1, 231);
            this.tb1.Multiline = true;
            this.tb1.Name = "tb1";
            this.tb1.ReadOnly = true;
            this.tb1.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.tb1.Size = new System.Drawing.Size(664, 268);
            this.tb1.TabIndex = 9;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(666, 501);
            this.Controls.Add(this.tb1);
            this.Controls.Add(this.cb1);
            this.Controls.Add(this.tb3);
            this.Controls.Add(this.tb2);
            this.Controls.Add(this.getripstations);
            this.Controls.Add(this.getinstdet);
            this.Controls.Add(this.getdriverdet);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.button1);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "Form1";
            this.Text = "Tareeqi";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Button getdriverdet;
        private System.Windows.Forms.Button getinstdet;
        private System.Windows.Forms.Button getripstations;
        private System.Windows.Forms.TextBox tb2;
        private System.Windows.Forms.TextBox tb3;
        private System.Windows.Forms.ComboBox cb1;
        private System.Windows.Forms.TextBox tb1;
    }
}

