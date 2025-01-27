package Program_13 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B, b: T_A[T_B, C]) extends T_A[T_A[C, C], C]
case class CC_B[E](a: E, b: E) extends T_A[T_B, E]
case class CC_C[F](a: CC_B[F], b: T_A[T_B, F]) extends T_A[T_B, F]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _)) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A Int T_B Wildcard Wildcard (T_A (T_A Int Int) Int))
// This is not matched: Pattern match is empty without constants