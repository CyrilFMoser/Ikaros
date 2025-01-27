package Program_62 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: C) extends T_A[D, C]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_A(_, (CC_B(_, _, _),CC_B(_, _, _))) at position 2