package Program_14 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, Boolean]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F, G, H](a: CC_B[G]) extends T_B[F, G]
case class CC_D[I, J](a: CC_B[I], b: CC_A[J], c: T_A[I]) extends T_B[I, J]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
  case CC_D(CC_B(), CC_A(_), _) => 1 
  case CC_D(CC_B(), _, CC_A(_)) => 2 
  case CC_D(_, _, CC_B()) => 3 
  case CC_D(CC_B(), CC_A(_), CC_B()) => 4 
  case CC_D(_, CC_A(_), _) => 5 
  case CC_D(_, _, _) => 6 
  case CC_D(CC_B(), CC_A(_), CC_A(_)) => 7 
  case CC_D(_, _, CC_A(_)) => 8 
}
}
// This is not matched: (CC_C Int Boolean Boolean (CC_B Boolean (T_A Boolean)) (T_B Int Boolean))
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)