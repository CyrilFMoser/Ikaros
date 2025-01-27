package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[Int]) extends T_A[Int]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
}
}