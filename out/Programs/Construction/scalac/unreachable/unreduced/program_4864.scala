package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[CC_A, Char], CC_A]) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[C]() extends T_B[CC_A, C]
case class CC_E(a: CC_C, b: CC_A) extends T_B[CC_A, T_B[T_B[CC_A, Byte], T_B[CC_A, CC_A]]]
case class CC_F(a: CC_D[T_B[CC_A, CC_E]]) extends T_B[CC_A, T_B[T_B[CC_A, Byte], T_B[CC_A, CC_A]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A()) => 1 
}
}
// This is not matched: CC_A()