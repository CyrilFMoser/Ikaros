package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[Boolean, C]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
}
}
// This is not matched: (CC_A Char (CC_F Wildcard T_B) (T_A Boolean Char))