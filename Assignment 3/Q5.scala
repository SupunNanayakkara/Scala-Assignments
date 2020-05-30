object EvenNumAdd extends App
{
	  def isEven (n : Int ) : Boolean = n match 
	  {
		case 0 => true
		case _ => isOdd(n-1)
	  }
	  
	  def isOdd(n: Int) : Boolean = !(isEven(n))

	  def Add(n :Int ) : Int = n match 
	  {
		case 0 => 0
		case x if(isEven(x)) => n + Add(x-1)
		case x if(isOdd(x)) => Add(x-1)
	  }
	  
	  println(Add(15))
}