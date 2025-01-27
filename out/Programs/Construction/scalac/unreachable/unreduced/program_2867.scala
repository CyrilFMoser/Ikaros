package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[(T_A,Byte), T_A]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A
case class CC_C(a: T_B[(T_A,CC_B), T_B[Boolean, Char]], b: (T_B[CC_A, T_A],CC_B), c: CC_A) extends T_B[CC_A, (Int,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_B(_, _, _), _) => 2 
  case CC_B(_, _, _) => 3 
}
}