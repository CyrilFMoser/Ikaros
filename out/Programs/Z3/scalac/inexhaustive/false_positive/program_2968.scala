package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: Int) extends T_A[C, D]
case class CC_C() extends T_B

val v_a: CC_A[CC_C, T_B] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants