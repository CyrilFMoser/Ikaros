package Program_15 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G](a: G) extends T_A[F, E]
case class CC_B(a: CC_A[Char, Char, Int], b: T_A[Boolean, Byte]) extends T_A[CC_A[Byte, Byte, Char], Int]
case class CC_C[H, I](a: T_A[I, I], b: I, c: CC_A[CC_B, I, H]) extends T_B[H, I]
case class CC_D[J](a: CC_C[J, J]) extends T_B[J, Int]
case class CC_E(a: T_A[CC_B, CC_B], b: Byte) extends T_B[T_B[Char, Int], Int]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _, _) => 0 
  case CC_D(CC_C(_, _, _)) => 1 
}
}
// This is not matched: (CC_C Byte
//      Int
//      (CC_A Int Int Boolean Boolean (T_A Int Int))
//      Int
//      Wildcard
//      (T_B Byte Int))
// This is not matched: (CC_C (Tuple Wildcard Wildcard) T_A)