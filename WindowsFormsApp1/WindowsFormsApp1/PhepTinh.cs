using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp1
{
    class PhepTinh
    {
        public PhepTinh()
        {
        }

        public PhepTinh(int no, string calculation)
        {
            this.no = no;
            this.calculation = calculation;
        }

        public int no { get; set; }
       public string calculation { get; set; }

        public void display()
        {
            Console.WriteLine("no: {0}, calculation: {1}", no, calculation);
        }
    }
}
