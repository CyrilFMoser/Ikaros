package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E]) extends T_A[E, F]
case class CC_B[G, H](a: T_B[G, G], b: T_A[G, H]) extends T_B[G, T_A[G, G]]
case class CC_C[I](a: T_A[I, I], b: I) extends T_B[I, T_A[I, I]]

val v_a: T_B[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_C(_, 12) => 0 
  case CC_C(CC_A(_), _) => 1 
  case CC_B(_, CC_A(_)) => 2 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Wildcard (T_B Int (T_A Int Int)))
// This is not matched: (CC_A Byte T_A)