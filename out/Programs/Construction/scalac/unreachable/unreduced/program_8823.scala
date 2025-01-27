package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A, (CC_A,CC_A)]) extends T_B[(T_B[(Boolean,Int), Char],Char), CC_A]
case class CC_C(a: CC_A, b: Byte, c: CC_B) extends T_B[(T_B[(Boolean,Int), Char],Char), CC_A]
case class CC_D(a: Int, b: CC_A, c: T_B[Boolean, T_B[CC_A, T_A]]) extends T_B[(T_B[(Boolean,Int), Char],Char), CC_A]

val v_a: T_B[(T_B[(Boolean,Int), Char],Char), CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(12, _, _) => 1 
  case CC_D(_, _, _) => 2 
}
}
// This is not matched: CC_B(_)