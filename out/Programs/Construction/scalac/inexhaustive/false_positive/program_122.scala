package Program_31 

package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, T_B], b: T_A[D, D]) extends T_A[D, T_B]
case class CC_C[E, F](a: T_A[F, T_B], b: CC_A[F]) extends T_A[E, T_B]

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_B(CC_C(_, _), _)
// This is not matched: CC_B()