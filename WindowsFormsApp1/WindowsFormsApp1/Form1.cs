using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.Common;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using MySql.Data.MySqlClient;
using WindowsFormsApp1;


namespace Nhóm3_Calculator
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void txtCalculator_KeyPress(object sender, KeyPressEventArgs e)
        {
            if ((e.KeyChar >= '0') && (e.KeyChar <= '9'))
            { e.Handled = false; }
            else
            { e.Handled = true; }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            txtCalculator.Text = "0";
        }
        private void txtCalculator_TextChanged(object sender, EventArgs e)
        {

        }
        void ham(Button t)
        {
            if (txtCalculator.Text.Length <= 20)
            {
                txtCalculator.AppendText(t.Text);
            }
        }
        void kiemtra()
        {
            if (txtCalculator.Text == "0") { txtCalculator.Text = ""; }
        }

        private void bt0_Click(object sender, EventArgs e)
        {
            kiemtra();
            ham(bt0);
        }

        private void bt1_Click(object sender, EventArgs e)
        {
            kiemtra();
            ham(bt1);
        }

        private void bt2_Click(object sender, EventArgs e)
        {
            kiemtra();
            ham(bt2);
        }

        private void bt3_Click(object sender, EventArgs e)
        {
            kiemtra();
            ham(bt3);
        }

        private void bt4_Click(object sender, EventArgs e)
        {
            kiemtra();
            ham(bt4);
        }

        private void bt5_Click(object sender, EventArgs e)
        {
            kiemtra();
            ham(bt5);
        }

        private void bt6_Click(object sender, EventArgs e)
        {
            kiemtra();
            ham(bt6);
        }

        private void bt7_Click(object sender, EventArgs e)
        {
            kiemtra();
            ham(bt7);
        }

        private void bt8_Click(object sender, EventArgs e)
        {
            kiemtra();
            ham(bt8);
        }

        private void bt9_Click(object sender, EventArgs e)
        {
            kiemtra();
            ham(bt9);
        }
        private void frmCalculator_KeyPress(object sender, KeyPressEventArgs e)
        {
            //nhap so
            if (e.KeyChar == '0')
             txtCalculator.AppendText("0"); 
            else if (e.KeyChar == '1')
                txtCalculator.AppendText("1");
            else if (e.KeyChar == '2')
                txtCalculator.AppendText("2");
            else if (e.KeyChar == '3')
                txtCalculator.AppendText("3");
            else if (e.KeyChar == '4')
                txtCalculator.AppendText("4");
            else if (e.KeyChar == '5')
                txtCalculator.AppendText("5");
            else if (e.KeyChar == '6')
                txtCalculator.AppendText("6");
            else if (e.KeyChar == '7')
                txtCalculator.AppendText("7");
            else if (e.KeyChar == '8')
                txtCalculator.AppendText("8");
            else if (e.KeyChar == '9')
                txtCalculator.AppendText("9");
        }

        private void btCongtru_Click(object sender, EventArgs e)
        {
            double i = double.Parse(txtCalculator.Text);
            double j = i * (-1);
            txtCalculator.Text = j.ToString();
        }
        int i = 0;

        private void btCham_Click(object sender, EventArgs e)
        {
            i++;
            if (i == 1)
            {
                txtCalculator.AppendText(".");
            }
        }
        double SoThuNhat;
        char ch;

        private void btCong_Click(object sender, EventArgs e)
        {
            SoThuNhat = double.Parse(txtCalculator.Text);
            ch = '+';
            txtCalculator.Text = "";
            i = 0;
        }

        private void btTru_Click(object sender, EventArgs e)
        {
            SoThuNhat = double.Parse(txtCalculator.Text);
            ch = '-';
            txtCalculator.Text = "";
            i = 0;
        }

        private void btNhan_Click(object sender, EventArgs e)
        {
            SoThuNhat = double.Parse(txtCalculator.Text);
            ch = '*';
            txtCalculator.Text = "";
            i = 0;
        }

        private void btChia_Click(object sender, EventArgs e)
        {
            SoThuNhat = double.Parse(txtCalculator.Text);
            ch = '/';
            txtCalculator.Text = "";
            i = 0;
        }

        int no = 3;
        private void btBang_Click(object sender, EventArgs e)
        {
            double SoThuHai = double.Parse(txtCalculator.Text);
            double KQ;
            string pt=null;
            //cong
            if (ch == '+')
            {
                KQ = SoThuNhat + SoThuHai;
                txtCalculator.Text = KQ.ToString();
                pt  = SoThuNhat + " + " + SoThuHai + " = " + KQ;
                no++;
            }
            //tru
            if (ch == '-')
            {
                KQ = SoThuNhat - SoThuHai;
                txtCalculator.Text = KQ.ToString();
                pt = SoThuNhat + " - " + SoThuHai + " = " + KQ;
                no++;
            }
            //nhan
            if (ch == '*')
            {
                KQ = SoThuNhat * SoThuHai;
                txtCalculator.Text = KQ.ToString();
                 pt = SoThuNhat + " * " + SoThuHai + " = " + KQ;
                no++;
            }
            //chia
            if (ch == '/')
            {
                KQ = SoThuNhat / SoThuHai;
                txtCalculator.Text = KQ.ToString();
                 pt = SoThuNhat + " / " + SoThuHai + " = " + KQ;
                no++;
            }
                insertData(no, pt);
            Console.WriteLine("{0}; {1}",no,pt);
        }

        private void btSqrt_Click(object sender, EventArgs e)
        {
            double a = double.Parse(txtCalculator.Text);
            if (a < 0)
                txtCalculator.Text = "Error!Số âm không có căn bậc 2";
            else
            {
                a = Math.Sqrt(a);
                txtCalculator.Text = a.ToString();
                string pt = "sqrt( " + a + " )";
                no++;
                insertData(no, pt);

            }
        }

        private void btBinhphuong_Click(object sender, EventArgs e)
        {
            double a = double.Parse(txtCalculator.Text);
            double x = a * a;
            txtCalculator.Text = x.ToString();

            string pt = a + " * "+ a +" = "+ x ;
            no++;
            insertData(no, pt);
        }

        private void btNghichdao_Click(object sender, EventArgs e)
        {
            double bien = double.Parse(txtCalculator.Text);
            double KQ;
            KQ = 1 / bien;
            txtCalculator.Text = KQ.ToString();

            string pt = "1 / " + bien + " = "+ KQ ;
            no++;
            insertData(no, pt);

        }

        private void btC_Click(object sender, EventArgs e)
        {
            txtCalculator.Text = "0";
        }

        private void btBackspace_Click(object sender, EventArgs e)
        {
            if (txtCalculator.Text != "")
            {
                txtCalculator.Text = txtCalculator.Text.Remove(txtCalculator.Text.Length - 1);
                if (txtCalculator.Text == "") txtCalculator.Text = "0";
            }
        }
        

        private void button1_Click(object sender, EventArgs e)
        {
            History his = new History();
           // his.MdiParent = this;
            his.Show();
            
        }

        private void insertData(int no,  string pt)
        {
            string host = "localhost"; // 127.0.0.1
            int port = 3306;
            string database = "calculator";
            string username = "root";
            string password = "";
            String a = "Server=" + host + ";Database=" + database + ";port=" + port + ";User Id=" + username + ";password=" + password;

            MySqlConnection conn = new MySqlConnection(a);
            conn.Open();
            try
            {
                string sql = "Insert into a(no,calculation) values (@no,@cal)";
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = conn;
                cmd.CommandText = sql;

                MySqlParameter no1 = new MySqlParameter("@no", SqlDbType.Int);
                no1.Value = no;
                cmd.Parameters.Add(no1);

                MySqlParameter cal = cmd.Parameters.Add("@cal", (MySqlDbType)SqlDbType.NVarChar);
                cal.Value = pt;

                int rowCount = cmd.ExecuteNonQuery();
                rowCount++;
            }
            catch (Exception)
            {
                Console.WriteLine("error");
            }
            finally
            {
                conn.Close();
                conn.Dispose();

            }
            Console.Read();
        }
    }
}