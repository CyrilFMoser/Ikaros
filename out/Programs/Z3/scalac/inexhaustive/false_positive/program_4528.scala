package Program_11 

object Test {
sealed trait T_A[A]
case class CC_B[D](a: Int) extends T_A[D]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_A Wildcard (CC_C Char (T_A Char)) (T_A Char)) (T_A Char))