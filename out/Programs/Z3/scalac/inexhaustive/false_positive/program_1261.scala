package Program_30 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: E, b: T_B[E]) extends T_A[D, Char]
case class CC_B[F](a: T_A[F, Char]) extends T_A[F, Char]
case class CC_C(a: Boolean, b: Boolean, c: T_A[(Int,Boolean), Char]) extends T_A[T_B[Char], Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_B(CC_A(_, _)) => 2 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A Int Char))
// This is not matched: (CC_C (T_A Int))