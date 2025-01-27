package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Byte]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: Boolean, b: Char) extends T_A
case class CC_D() extends T_B[CC_B]
case class CC_E(a: CC_C, b: (CC_C,T_B[Char])) extends T_B[CC_B]
case class CC_F() extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_C(_, 'x'), (CC_C(_, _),_)) => 1 
  case CC_E(CC_C(_, _), (CC_C(_, _),_)) => 2 
  case CC_F() => 3 
}
}