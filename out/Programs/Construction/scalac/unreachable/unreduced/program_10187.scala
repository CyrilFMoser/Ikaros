package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: E) extends T_A[E, F]
case class CC_B[G](a: T_A[G, G], b: T_A[T_B[G, G], G], c: CC_A[G, G]) extends T_A[Boolean, G]
case class CC_C[H](a: T_A[Boolean, H], b: H, c: T_A[H, H]) extends T_B[H, Char]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _, CC_A(_)) => 0 
  case CC_C(CC_B(CC_A(_), CC_A(_), CC_A(_)), _, CC_A(_)) => 1 
}
}