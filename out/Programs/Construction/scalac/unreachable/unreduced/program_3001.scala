package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[Int, D]
case class CC_B[E](a: CC_A[E], b: T_A[E, E]) extends T_A[T_A[Int, Int], E]
case class CC_C[F](a: T_B[F], b: F, c: Boolean) extends T_B[F]
case class CC_D[G](a: (CC_C[Int],T_B[Boolean]), b: CC_C[G]) extends T_B[G]
case class CC_E[H](a: H, b: T_A[Int, H]) extends T_B[H]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, 0, _), _, _) => 0 
  case CC_C(CC_C(_, _, _), _, _) => 1 
  case CC_C(CC_D((_,_), _), _, _) => 2 
  case CC_C(CC_E(_, CC_A(_)), _, _) => 3 
  case CC_D(_, CC_C(_, _, _)) => 4 
  case CC_E(0, CC_A(_)) => 5 
  case CC_E(_, CC_A(_)) => 6 
}
}