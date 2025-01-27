package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}