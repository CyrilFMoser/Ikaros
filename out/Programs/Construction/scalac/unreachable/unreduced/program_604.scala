package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Int, b: Boolean, c: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: CC_A[E]) extends T_A[E, T_A[E, E]]
case class CC_D(a: CC_C[Byte]) extends T_B

val v_a: T_A[T_B, T_A[T_B, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_)) => 2 
}
}