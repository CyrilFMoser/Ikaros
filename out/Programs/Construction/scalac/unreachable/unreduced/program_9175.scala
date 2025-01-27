package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C[C]() extends T_B[T_B[C, C], C]
case class CC_D(a: CC_B, b: CC_A, c: CC_C[CC_A]) extends T_B[T_B[CC_B, CC_B], CC_B]
case class CC_E[D](a: Char, b: T_B[CC_C[D], T_A]) extends T_B[T_B[CC_B, CC_B], CC_B]

val v_a: T_B[T_B[CC_B, CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_), _, _) => 0 
  case CC_E('x', _) => 1 
  case CC_E(_, _) => 2 
}
}
// This is not matched: CC_C()