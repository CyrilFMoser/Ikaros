package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
}
}
// This is not matched: (CC_B Int (CC_B Int Wildcard Int (T_A Int Byte)) Wildcard (T_A Int Byte))
// Mutation information: 
// Deleted Pattern CC_B(CC_C(_, _), _) at position 2