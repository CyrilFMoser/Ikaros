package Program_62 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[C, T_A[C, C]]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Int (CC_D Int (T_B Int)) (T_A (T_A Int Int) Int))
// Mutation information: 
// Deleted Pattern CC_B(CC_A(_), 12, _) at position 7