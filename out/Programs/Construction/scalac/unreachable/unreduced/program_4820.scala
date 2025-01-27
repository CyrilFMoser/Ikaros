package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[(CC_A,Byte)], b: T_A) extends T_A
case class CC_C(a: T_A, b: CC_B, c: (T_A,CC_A)) extends T_A
case class CC_D() extends T_B[CC_B]
case class CC_E(a: CC_D) extends T_B[CC_B]
case class CC_F(a: CC_E) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(), _, _) => 2 
  case CC_C(CC_B(_, _), _, _) => 3 
  case CC_C(CC_C(_, CC_B(_, _), _), _, _) => 4 
}
}