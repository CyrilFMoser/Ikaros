package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[CC_A[T_B]]) extends T_A[T_A[T_A[T_B, Int], T_A[T_A[T_B, Int], T_A[T_B, Int]]], T_A[T_A[T_A[T_B, Int], T_A[T_A[T_B, Int], T_A[T_B, Int]]], T_A[T_A[T_B, Int], T_A[T_A[T_B, Int], T_A[T_B, Int]]]]]
case class CC_C(a: Boolean, b: T_A[CC_A[T_B], CC_A[CC_B]], c: T_A[CC_B, CC_A[T_B]]) extends T_B
case class CC_D(a: Byte) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(0) => 1 
  case CC_D(_) => 2 
  case CC_E() => 3 
}
}