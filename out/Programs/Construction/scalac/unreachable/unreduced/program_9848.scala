package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Byte]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: Boolean, c: (T_B[CC_B],CC_A)) extends T_A
case class CC_D() extends T_B[CC_C]
case class CC_E(a: T_B[CC_C], b: T_A, c: CC_A) extends T_B[CC_C]
case class CC_F(a: CC_A, b: T_A) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_F(CC_A(_), _) => 1 
}
}
// This is not matched: CC_E(_, _, _)