package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D], b: T_A[E, E]) extends T_A[D, E]
case class CC_B[G, F]() extends T_A[G, F]
case class CC_C[H](a: T_A[H, H]) extends T_A[H, T_B[H]]
case class CC_D(a: CC_A[CC_C[Boolean], CC_B[Byte, Byte]]) extends T_B[CC_A[CC_B[Byte, Boolean], T_A[Boolean, Byte]]]

val v_a: T_A[Byte, T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, CC_A(_, _))) => 1 
  case CC_C(CC_A(_, CC_B())) => 2 
  case CC_C(CC_B()) => 3 
}
}
// This is not matched: CC_A(_, _)