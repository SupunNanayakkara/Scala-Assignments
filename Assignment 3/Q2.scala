object PrintPrime extends App
{

	  def GCD(num1 : Int, num2 :Int ):Int = num2 match
	  {
		case 0 => num1
		case a if a > num1 => GCD(a,num1)
		case _ => GCD(num2,num1 % num2)
	  }

	  def prime(num : Int , div : Int = 2): Boolean = div match
	  {
		case a if(num == div) => true
		case a if GCD(num,div) > 1 => false
		case _ => prime(num,div+1)
	  }
	  
	  def primeSeq(n : Int, i : Int = 2) : Unit = 
	  {
		if (prime(i)== true) print(i+" ")
		if (n > i) primeSeq(n,i+1)
	  }

	  primeSeq(10)
	  print("\n")
	  primeSeq(30)
	  print("\n")
	  primeSeq(40)
	  print("\n")
}