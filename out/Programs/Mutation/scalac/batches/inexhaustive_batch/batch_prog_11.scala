package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: Char, b: T_A[C], c: T_A[C]) extends T_A[C]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
  case CC_B('x', CC_B(_, _, _), _) => 1 
}
}
// This is not matched: (CC_B Int Wildcard Wildcard (CC_A Int (T_A Int)) (T_A Int))
// Mutation information: 
// Deleted Pattern CC_B('x', CC_A(), _) at position 2