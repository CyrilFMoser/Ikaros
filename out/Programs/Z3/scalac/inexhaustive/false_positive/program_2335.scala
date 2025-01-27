package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: T_A[D, D], b: D) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_A Char Wildcard Wildcard Wildcard (T_A (T_A Char Char) Char))