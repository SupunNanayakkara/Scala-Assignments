object TicketPriceCalculation
{
    def main(args: Array[String])
    {
        print(profit(5),profit(10),profit(15),profit(20),profit(25),profit(30),profit(35));
    }
    def profit(ticketcost:Int):Int=
    {
        Income(ticketcost) - cost(ticketcost);
    }
    def Income(ticket:Int):Int=
    {
        NoOfAttendance(ticket)*ticket;
    }
    def cost(ticketcost:Int):Int=
    {
        500 + 3*NoOfAttendance(ticketcost);
    }
    def NoOfAttendance(ticketprice:Int):Int =
    {
        120 + ((15- ticketprice)/5)*20;
    }
}