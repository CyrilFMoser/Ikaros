package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte) extends T_A
case class CC_B(a: T_B[(CC_A,CC_A), T_A], b: CC_A, c: T_B[CC_A, T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C, b: T_A) extends T_B[C, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)