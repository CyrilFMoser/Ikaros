package Program_29 

object Test {
sealed trait T_A[A]
case class CC_C[C](a: Char) extends T_A[C]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_C T_A)