package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[Int]) extends T_A
case class CC_B(a: Char, b: T_A, c: CC_A) extends T_A
case class CC_C(a: (CC_B,Boolean)) extends T_A
case class CC_D(a: CC_C, b: Int) extends T_B[CC_B]
case class CC_E(a: T_B[CC_C], b: T_A) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_C((_,_)), _) => 0 
  case CC_E(_, _) => 1 
}
}