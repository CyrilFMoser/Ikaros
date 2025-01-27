package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_C[H](a: H) extends T_A[H, T_A[H, H]]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants