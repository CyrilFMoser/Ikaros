package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: C) extends T_A[C]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: Boolean, b: T_A[F], c: F) extends T_A[F]
case class CC_D[G]() extends T_B[G]
case class CC_E[H](a: T_A[H]) extends T_B[H]
case class CC_F[I](a: I) extends T_B[Int]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_B(_), _) => 2 
  case CC_C(_, _, _) => 3 
  case CC_C(_, CC_A(_), _) => 4 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: (CC_B Wildcard (T_A (T_A Int)))