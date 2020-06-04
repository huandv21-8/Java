using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.Common;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace WindowsFormsApp1
{
    public partial class History : Form
    {
      List<PhepTinh> list = new List<PhepTinh>();
        public History()
        {
            InitializeComponent();
             show();
            foreach(PhepTinh pt in list)
            {
                pt.display();

            }
            Console.WriteLine(list.Count());
            hienthi();
        }

        private void button1_Click(object sender, EventArgs e)
        {
         
        }

        private void show()
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
                string sql = "Select * from a";

                MySqlCommand cmd = new MySqlCommand();

                cmd.Connection = conn;
                cmd.CommandText = sql;

                using (DbDataReader reader = cmd.ExecuteReader())
                {
                    while (reader.Read())
                    {
                        int no = reader.GetOrdinal("no");
                        int no1 = reader.GetInt32(no);
                        int x = reader.GetOrdinal("calculation");
                        string calculation = reader.GetString(x);
                        PhepTinh pt = new PhepTinh(no1, calculation);
                        list.Add(pt);
                    }

                }

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

        private void hienthi()
        {
            DataTable data = new DataTable();

            data.Columns.Add("no", typeof(int));
            data.Columns.Add("Calculation", typeof(string));


            foreach (PhepTinh pt in list)
            {
                DataRow dulieu = data.NewRow();
                dulieu["no"] = pt.no;
                dulieu["Calculation"] = pt.calculation;
                data.Rows.Add(dulieu);
            }
            dataGridView1.DataSource = data;

        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
          
        }
    }
}
