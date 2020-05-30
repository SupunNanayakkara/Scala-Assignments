object NumCheck extends App
{

	  def Even (n : Int ) : Boolean = n match 
	  {
		case 0 => true
		case _ => Odd(n-1)

	  }

	  def Odd(n: Int) : Boolean = !(Even(n))

	  println("8 :"+Even(8))
	  println("13 :"+Even(13))
	  println("21 :"+Even(21))
	  println("50 :"+Even(50))
}