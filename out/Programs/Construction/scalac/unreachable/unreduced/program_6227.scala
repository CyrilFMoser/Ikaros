package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, F]) extends T_A[E, F]
case class CC_B[G, H](a: T_A[H, H], b: T_B[H, G]) extends T_A[G, H]
case class CC_C[J, I](a: I, b: T_A[J, J], c: CC_A[J, J]) extends T_A[I, J]
case class CC_D[K](a: K, b: T_A[K, K], c: K) extends T_B[CC_A[Byte, Char], K]

val v_a: T_B[CC_A[Byte, Char], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(CC_A(_)), _) => 0 
  case CC_D(_, CC_A(CC_B(_, _)), _) => 1 
  case CC_D(_, CC_A(CC_C(_, _, _)), _) => 2 
  case CC_D(_, CC_B(CC_A(_), _), _) => 3 
  case CC_D(_, CC_B(CC_B(_, _), _), _) => 4 
  case CC_D(_, CC_B(CC_C(_, _, _), _), _) => 5 
  case CC_D(_, CC_C(_, _, _), _) => 6 
}
}