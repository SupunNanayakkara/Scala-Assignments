object SalCal
{
    def main(args: Array[String])
    {
        print("Take Home Salary = "+NetSal(40,20))
    }

    def BasicSalary(hours :Int) = 
    {
        hours*150
    }
    def OT(hours :Int): Int =
    {
        hours*75
    }
    def tax(sal :Double): Double = 
    {
        sal*0.1*4
    }
    def TotalSalary(nHr :Int,OtHr :Int): Double = 
    {
        BasicSalary(nHr)+OT(OtHr)
    }
    def NetSal(nHr :Int,OtHr :Int): Double = 
    {
        TotalSalary(nHr,OtHr)-tax(TotalSalary(nHr,OtHr))
    }

}