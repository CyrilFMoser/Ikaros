package Program_29 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G](a: G, b: T_A[G, Int]) extends T_A[F, E]
case class CC_B[H](a: T_A[H, H]) extends T_A[T_B[Byte, Boolean], H]
case class CC_C(a: Byte, b: T_A[Int, Int], c: CC_B[Byte]) extends T_A[T_B[Byte, Boolean], (Byte,Boolean)]

val v_a: T_A[T_A[T_B[Byte, Boolean], (Byte,Boolean)], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A (T_A (T_B Byte Boolean) (Tuple Byte Boolean))
//      Char
//      Boolean
//      Wildcard
//      (CC_A Boolean Int Wildcard Boolean Wildcard (T_A Boolean Int))
//      (T_A (T_A (T_B Byte Boolean) (Tuple Byte Boolean)) Char))
// This is not matched: (CC_C (T_A (T_A Boolean)))