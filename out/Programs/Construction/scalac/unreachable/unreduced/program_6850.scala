package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C(a: (T_B,Int), b: T_A[CC_A[Char], T_A[T_B, T_B]]) extends T_B
case class CC_D(a: CC_C, b: T_A[T_A[T_B, CC_C], CC_A[CC_C]]) extends T_B
case class CC_E(a: T_B, b: CC_A[Char]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_C(_, _), _) => 1 
  case CC_E(_, CC_A()) => 2 
}
}