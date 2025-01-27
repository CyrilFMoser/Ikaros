package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, 'x') => 0 
}
}
// This is not matched: (CC_A Char Wildcard (T_A (T_A Char Char) Char))