object PrintFibonacci extends App
{

	  def fib(n : Int) : Int = n match 
	  {
		case 0 => 0
		case 1 => 1
		case _ => fib(n-1)+fib(n-2)
	  }

	  def PrintFib(n : Int,i : Int = 0) : Unit = 
	  {
		print(fib(i)+" ")
		if (n-1 > i) PrintFib(n,i+1)
	  }

	  PrintFib(8)
}