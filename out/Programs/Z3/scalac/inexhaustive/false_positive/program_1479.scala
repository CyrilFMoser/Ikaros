package Program_30 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: E) extends T_A[E, T_B[E, Byte]]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C[H, I](a: CC_B[H, H], b: T_A[I, I]) extends T_B[H, T_B[H, H]]

val v_a: T_B[Int, T_B[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), _) => 0 
}
}
// This is not matched: (CC_C Int Boolean Wildcard Wildcard (T_B Int (T_B Int Int)))
// This is not matched: (CC_B T_A)