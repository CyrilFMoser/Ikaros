package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C]) extends T_A[T_A[T_A[Byte, Boolean], Int], C]
case class CC_B[D](a: T_A[D, Byte], b: D, c: CC_A[D]) extends T_A[D, Byte]
case class CC_C[E](a: CC_B[E]) extends T_A[E, Byte]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A(_, _)), _, _) => 0 
  case CC_B(CC_B(CC_C(_), _, CC_A(_, _)), _, _) => 1 
  case CC_B(CC_C(CC_B(_, _, _)), _, _) => 2 
}
}