package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[Boolean], c: T_A[B]) extends T_A[B]
case class CC_B[C](a: T_A[C]) extends T_A[C]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}