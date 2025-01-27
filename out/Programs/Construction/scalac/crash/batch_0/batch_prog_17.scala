package Program_17 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: (T_B,T_B)) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_B, b: (Byte,CC_A), c: (CC_B,(CC_A,CC_C))) extends T_B
case class CC_E(a: Byte) extends T_B
case class CC_F() extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_D(_, _, _), (_,_), (_,_)), _) => 0 
  case CC_A(CC_D(CC_E(_), (_,_), (_,_)), _) => 1 
  case CC_A(CC_D(CC_F(), (_,_), (_,_)), _) => 2 
  case CC_A(CC_E(0), _) => 3 
  case CC_A(CC_E(_), _) => 4 
  case CC_A(CC_F(), _) => 5 
  case CC_B(_, _) => 6 
  case CC_C() => 7 
}
}