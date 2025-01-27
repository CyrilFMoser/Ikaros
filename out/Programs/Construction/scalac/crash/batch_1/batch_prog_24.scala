package Program_24 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: Boolean) extends T_A
case class CC_B(a: (T_A,CC_A), b: T_B) extends T_A
case class CC_C(a: T_A, b: T_B, c: Byte) extends T_A
case class CC_D(a: Int, b: T_A) extends T_B
case class CC_E(a: CC_B, b: Int, c: T_B) extends T_B
case class CC_F(a: CC_E) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(CC_E(CC_B(_, _), _, CC_D(_, _))) => 2 
  case CC_F(CC_E(CC_B(_, _), _, CC_E(_, _, _))) => 3 
}
}
// This is not matched: CC_F(CC_E(CC_B(_, _), _, CC_F(_)))