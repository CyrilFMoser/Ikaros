package Program_57 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: C) extends T_A[C, D]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A T_A)
// Mutation information: 
// Deleted Pattern CC_C('x') at position 1