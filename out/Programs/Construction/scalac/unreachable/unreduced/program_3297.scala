package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, CC_A[D]]
case class CC_C[E](a: CC_B[E]) extends T_A[CC_B[T_A[Char, Int]], CC_A[CC_B[T_A[Char, Int]]]]

val v_a: T_A[CC_B[T_A[Char, Int]], CC_A[CC_B[T_A[Char, Int]]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_C(_) => 1 
}
}