package Program_62 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[Int, Boolean], b: Byte) extends T_A[T_A[Byte, Char], T_B[Char, Int]]
case class CC_B[E]() extends T_B[E, T_A[E, E]]

val v_a: T_A[T_A[Byte, Char], T_B[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_B Int Wildcard Wildcard (T_A (T_A Byte (Tuple Byte Boolean)) Int))
// Mutation information: 
// Deleted Pattern CC_A(0, _, 12) at position 3