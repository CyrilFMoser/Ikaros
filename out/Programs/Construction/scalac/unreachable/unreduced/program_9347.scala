package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: Char, b: T_B[(T_A,(Byte,Byte)), T_B[CC_B, CC_B]]) extends T_A
case class CC_D[C](a: (CC_C,T_B[T_A, CC_A])) extends T_B[C, Boolean]
case class CC_E(a: CC_B, b: T_B[T_B[Char, T_A], CC_B]) extends T_B[CC_D[(CC_A,(Char,Byte))], Int]
case class CC_F(a: CC_A) extends T_B[CC_D[(CC_A,(Char,Byte))], Int]

val v_a: T_B[CC_D[(CC_A,(Char,Byte))], Int] = null
val v_b: Int = v_a match{
  case CC_E(CC_B(CC_A()), _) => 0 
  case CC_E(CC_B(CC_B(_)), _) => 1 
  case CC_E(CC_B(CC_C(_, _)), _) => 2 
  case CC_F(CC_A()) => 3 
}
}