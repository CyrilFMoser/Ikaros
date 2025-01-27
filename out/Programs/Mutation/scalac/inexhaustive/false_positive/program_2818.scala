package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D](a: CC_B[D], b: CC_A[D], c: T_A[D]) extends T_A[D]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_A Char Wildcard (T_A Char))
// Mutation information: 
// Deleted Pattern CC_B(_, CC_A(_), CC_B(_, _, _)) at position 0