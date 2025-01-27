package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_A, c: Boolean) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: T_A, c: T_B[CC_B]) extends T_A
case class CC_D() extends T_B[CC_C]
case class CC_E(a: CC_D, b: CC_C, c: T_A) extends T_B[CC_C]
case class CC_F(a: CC_B, b: CC_A, c: Int) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), CC_C(_, _, _), _) => 1 
}
}
// This is not matched: CC_F(_, _, _)