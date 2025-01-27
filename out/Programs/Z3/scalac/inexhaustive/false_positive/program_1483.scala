package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[Int, Int]) extends T_A[C, D]
case class CC_B[E, F, G](a: T_A[E, E]) extends T_A[F, E]
case class CC_C[H](a: T_A[H, H], b: Char, c: CC_B[H, H, H]) extends T_A[H, T_A[Char, H]]

val v_a: CC_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
}
}
// This is not matched: (CC_A Boolean
//      Int
//      (CC_B Int Int Boolean Wildcard (T_A Int Int))
//      (T_A Int Boolean))
// This is not matched: Pattern match is empty without constants