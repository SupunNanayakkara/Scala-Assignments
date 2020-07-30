object NegativeRational extends App
{
  val a = new Rational(8,5)
  println(a.neg)
}

class Rational(n:Int,d:Int)
{
  def numer = n
  def denom = d
  def neg = new Rational(-this.numer, this.denom)
  override def toString=numer + "/" + denom
}
