package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_C[C](a: Int) extends T_B[C, T_B[C, T_A]]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants