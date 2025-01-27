package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F](a: F) extends T_A[E, F]

val v_a: CC_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B (CC_A (T_A Boolean (T_A Boolean (T_A (T_A Boolean Boolean) Boolean))))
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_B Int Int) (T_A Int Int)))
// Mutation information: 
// Deleted Pattern CC_B(CC_E(_, _, _), 0, _) at position 7