package Program_15 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[T_B[Boolean]]
case class CC_B(a: T_A[Char]) extends T_A[T_B[Boolean]]
case class CC_C[D](a: D, b: D, c: CC_A[D]) extends T_A[D]
case class CC_D[E](a: Boolean, b: CC_A[E]) extends T_B[E]
case class CC_E[F]() extends T_B[F]

val v_a: T_A[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_, _, _)) => 0 
  case CC_C(CC_D(_, _), CC_E(), _) => 1 
  case CC_C(_, _, _) => 2 
  case CC_C(CC_E(), _, CC_A(_)) => 3 
  case CC_C(CC_D(_, _), _, CC_A(_)) => 4 
  case CC_A(_) => 5 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_B Boolean)))
// This is not matched: (CC_C (T_B (T_B Byte)))