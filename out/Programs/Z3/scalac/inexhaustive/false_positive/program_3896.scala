package Program_14 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[T_B[Boolean, Char], E]
case class CC_B[F, G](a: CC_A[F]) extends T_A[T_B[Boolean, Char], F]
case class CC_C[H, I](a: I, b: CC_A[Char]) extends T_A[CC_A[Byte], H]
case class CC_D[J](a: (Int,Char), b: CC_B[Char, J], c: CC_C[J, J]) extends T_B[Boolean, J]

val v_a: T_A[T_B[Boolean, Char], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_B Int Boolean Wildcard (T_A (T_B Boolean Char) Int))
// This is not matched: (CC_A (T_A T_B T_B))