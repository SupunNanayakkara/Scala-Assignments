object SubstractRationalNumbers extends App
{
  val x=new Rational(3,4)
  val y=new Rational(5,8)
  val z=new Rational(2,7)
  val temp = y+z
  val ans = x-temp
  println(ans)
}

class Rational(n:Int,d:Int)
{
  def numer = n
  def denom = d
  def neg = new Rational(-this.numer,this.denom)
  def +(r:Rational) = new Rational(this.numer * r.denom + this.denom * r.numer, r.denom * this.denom)
  def -(r:Rational)= this + r.neg
  override def toString = numer + "/" + denom
}