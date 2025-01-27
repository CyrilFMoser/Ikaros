package Program_63 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: E) extends T_A[Byte, E]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A Char (Tuple Char Int)))
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 3 to a constant expression:
// {
//  12
// }
//