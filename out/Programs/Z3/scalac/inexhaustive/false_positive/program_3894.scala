package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_C[E](a: E) extends T_A[E, T_A[Char, Char]]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_A Wildcard Wildcard T_A) T_A)