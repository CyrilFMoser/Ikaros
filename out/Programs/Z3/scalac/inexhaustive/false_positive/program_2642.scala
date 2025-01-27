package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D](a: Char) extends T_A[(Char,Boolean), D]
case class CC_C() extends T_B

val v_a: CC_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A (T_B Char) (T_A (T_B Char)))