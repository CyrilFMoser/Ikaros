package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Char) extends T_B[T_B[CC_A, T_A], Boolean]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_B Char (CC_A Wildcard Wildcard T_A) T_A) Char) Wildcard T_A)