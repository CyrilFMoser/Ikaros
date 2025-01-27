package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, Byte], b: T_B[E, E], c: T_A[E, E]) extends T_A[E, Byte]
case class CC_B[F](a: F) extends T_A[F, Byte]
case class CC_C[G, H](a: CC_A[G], b: T_A[G, G], c: T_B[H, H]) extends T_B[H, G]
case class CC_D[J, I]() extends T_B[J, I]
case class CC_E[K](a: CC_A[K], b: CC_D[K, CC_D[K, K]], c: K) extends T_B[K, CC_B[T_B[Byte, Int]]]

val v_a: T_B[Boolean, CC_B[T_B[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), _, CC_C(_, _, _)) => 0 
  case CC_C(CC_A(_, _, _), _, CC_D()) => 1 
  case CC_D() => 2 
  case CC_E(CC_A(CC_A(_, _, _), CC_C(_, _, _), _), _, _) => 3 
  case CC_E(CC_A(CC_A(_, _, _), CC_D(), _), _, _) => 4 
  case CC_E(CC_A(CC_B(_), CC_D(), _), _, _) => 5 
}
}
// This is not matched: CC_E(CC_A(CC_B(_), CC_C(_, _, _), _), _, _)