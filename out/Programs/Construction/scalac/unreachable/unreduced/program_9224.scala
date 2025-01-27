package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, F]) extends T_A[E, F]
case class CC_B[G, H](a: T_A[H, H], b: T_A[G, H], c: T_B[H, T_A[G, G]]) extends T_A[H, G]
case class CC_C[I](a: CC_B[I, I]) extends T_B[I, CC_B[Boolean, Int]]
case class CC_D[J](a: Char, b: CC_A[J, J], c: Boolean) extends T_B[J, CC_B[Boolean, Int]]

val v_a: T_B[Byte, CC_B[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, CC_B(_, _, _), _)) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_C(CC_B(_, CC_A(_), _))