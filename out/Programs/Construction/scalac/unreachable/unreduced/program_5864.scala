package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[T_A[D, D], T_A[T_A[D, D], T_A[D, D]]]) extends T_A[D, T_A[D, D]]
case class CC_C(a: CC_B[Byte], b: CC_A[T_B]) extends T_B
case class CC_D(a: Boolean) extends T_B
case class CC_E(a: T_A[Char, T_A[Char, Char]], b: T_A[T_A[Char, CC_D], (T_B,CC_D)], c: T_A[CC_B[(Boolean,Int)], CC_B[CC_D]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(true) => 0 
  case CC_D(false) => 1 
  case CC_E(_, _, _) => 2 
}
}
// This is not matched: CC_C(_, _)