package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_B[Boolean])) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C(a: T_B[CC_A]) extends T_A
case class CC_D(a: Boolean, b: T_A, c: T_A) extends T_B[Boolean]
case class CC_E(a: (CC_C,CC_C)) extends T_B[Boolean]
case class CC_F(a: T_B[CC_B]) extends T_B[Boolean]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A((_,_)), _) => 0 
  case CC_B(CC_B(_, CC_A(_)), _) => 1 
  case CC_B(CC_C(_), _) => 2 
}
}