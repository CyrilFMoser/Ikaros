package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte) extends T_A
case class CC_B(a: T_B[Char, CC_A]) extends T_A
case class CC_C[C]() extends T_B[C, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_A(_)