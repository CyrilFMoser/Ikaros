package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: C, b: T_A[D, C]) extends T_A[D, C]
case class CC_B[F](a: Int, b: T_A[F, Char]) extends T_A[F, T_A[F, F]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Int Char Boolean Wildcard Wildcard (T_A Char Int))
// This is not matched: (CC_C T_B)