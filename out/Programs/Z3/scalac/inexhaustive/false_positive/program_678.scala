package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G](a: T_B[F, E], b: E) extends T_A[F, E]
case class CC_B[H](a: T_A[H, H], b: T_A[H, H]) extends T_B[H, T_A[Byte, Boolean]]

val v_a: T_B[Int, T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_B(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_B Int
//      (CC_A Int Int Boolean Wildcard Int (T_A Int Int))
//      Wildcard
//      (T_B Int (T_A Byte Boolean)))
// This is not matched: (CC_A Wildcard (T_A (T_A Char)))