package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[T_A[C, C], C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_E T_A (CC_C T_A) Wildcard (CC_C T_A) (T_B T_A T_A))