package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_C[G](a: G) extends T_A[G, (T_B,Char)]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)