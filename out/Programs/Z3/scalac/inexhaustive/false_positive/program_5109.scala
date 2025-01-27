package Program_15 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C]) extends T_A
case class CC_B[D](a: T_B[D, D], b: CC_A[D]) extends T_B[T_A, D]
case class CC_C[E]() extends T_B[T_A, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(CC_C()) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: Pattern match is empty without constants