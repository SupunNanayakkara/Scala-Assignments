object NumAdd extends App
{

	  def add(n :Int ) : Int = n match 
	  {
		case 0 => 0
		case _ => n + add(n-1)
	  }
	  
	  print(add(5))
}