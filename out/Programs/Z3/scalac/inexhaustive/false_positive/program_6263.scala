package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char) extends T_A[T_A[T_B, T_B], C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard (T_A Char))