package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: (T_B[CC_A, CC_A],T_A), b: Boolean) extends T_A
case class CC_C(a: T_A, b: CC_B) extends T_A
case class CC_D[C](a: CC_C, b: T_B[(CC_A,T_A), C]) extends T_B[(CC_A,T_A), C]
case class CC_E(a: T_A, b: Int) extends T_B[(CC_A,T_A), (CC_C,CC_D[CC_B])]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A()), _) => 1 
  case CC_B((_,CC_B(_, _)), _) => 2 
  case CC_B((_,CC_C(_, _)), _) => 3 
  case CC_C(_, _) => 4 
}
}