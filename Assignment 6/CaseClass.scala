import scala.math

object CaseClass extends App 
{
	val p1 = point(3,5)
	val p2 = point(7,2)
	val p3 = p1.move(1,2)
	val p4 = p2.invert()

	println(p1)
	println(p2)
	println(p1+p2)
	println("p3"+p3)
	println("Distance="+p1.distance(p2))
	println("Invert p4"+p4)
}

case class point(a:Float, b:Float)
{
	def x:Float = a
	def y:Float = b

	//add two points - p((x1+x2),(y1+y2))
	def +(p:point) = point(this.x+p.x, this.y+p.y)
	//move function - move a point by a given distance dx and dy
	def move(dx:Float, dy:Float) = (this.x+dx, this.y+dy)
	//calculate distance between two points by using √((x1-x2)^2 + (y1-y2)^2) formula
	def distance(p:point) = (math.sqrt(math.pow(this.x-p.x,2) + math.pow(this.y-p.y,2)))
	//switch the x and y coordinates of a point
	def invert() = (this.y,this.x)
}