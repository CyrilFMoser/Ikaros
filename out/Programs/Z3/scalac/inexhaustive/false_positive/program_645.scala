package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[(Byte,Int), T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[C, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: (CC_C Boolean (CC_B Boolean (T_A Boolean)) Wildcard (T_A Boolean))