package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Boolean, c: T_B[Char]) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_B[(CC_A,T_B[CC_A])]
case class CC_C(a: Boolean) extends T_B[(CC_A,T_B[CC_A])]
case class CC_D() extends T_B[(CC_A,T_B[CC_A])]

val v_a: T_B[(CC_A,T_B[CC_A])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, true, _), _) => 0 
  case CC_B(CC_A(_, false, _), _) => 1 
  case CC_C(true) => 2 
  case CC_C(false) => 3 
  case CC_D() => 4 
}
}