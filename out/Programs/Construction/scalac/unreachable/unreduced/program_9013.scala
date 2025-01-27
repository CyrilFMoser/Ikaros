package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C]) extends T_A
case class CC_B(a: CC_A[CC_A[T_A]]) extends T_A
case class CC_C() extends T_A
case class CC_D[D](a: (T_B[CC_B, CC_C],CC_A[CC_C]), b: T_B[D, CC_C]) extends T_B[D, CC_C]
case class CC_E[E](a: T_B[E, E], b: Char, c: T_B[E, CC_C]) extends T_B[E, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
}
}
// This is not matched: CC_C()