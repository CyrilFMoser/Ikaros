package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: T_B[CC_A]) extends T_A
case class CC_D(a: (T_B[CC_C],(CC_C,CC_C)), b: CC_B) extends T_B[Boolean]
case class CC_E(a: T_A, b: CC_D, c: Int) extends T_B[Boolean]
case class CC_F(a: T_B[CC_D], b: CC_C) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D((_,_), CC_B(_)) => 0 
  case CC_E(CC_B(_), CC_D(_, _), _) => 1 
  case CC_E(CC_C(_), CC_D(_, _), _) => 2 
  case CC_F(_, _) => 3 
}
}
// This is not matched: CC_E(CC_A(_), CC_D(_, _), _)