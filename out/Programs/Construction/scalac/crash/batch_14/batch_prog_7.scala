package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Int) extends T_A[B]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
}
}