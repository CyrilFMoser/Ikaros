package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[T_A[D], D], b: T_B[D, T_A[D]], c: Boolean) extends T_A[D]
case class CC_B[E](a: Byte) extends T_A[E]
case class CC_C[F](a: CC_A[T_A[F]]) extends T_A[F]
case class CC_D[G](a: (CC_B[(Byte,Boolean)],T_A[Boolean]), b: T_A[G], c: G) extends T_B[G, (T_A[Int],CC_C[Int])]
case class CC_E[H](a: T_B[T_A[H], H]) extends T_B[H, (T_A[Int],CC_C[Int])]
case class CC_F[I]() extends T_B[I, (T_A[Int],CC_C[Int])]

val v_a: T_B[Char, (T_A[Int],CC_C[Int])] = null
val v_b: Int = v_a match{
  case CC_D((CC_B(_),CC_A(_, _, _)), CC_A(_, _, _), _) => 0 
  case CC_D((CC_B(_),CC_B(_)), CC_A(_, _, _), _) => 1 
  case CC_D((CC_B(_),CC_A(_, _, _)), CC_B(_), _) => 2 
  case CC_D((CC_B(_),CC_B(_)), CC_B(_), _) => 3 
  case CC_D((CC_B(_),CC_C(_)), CC_B(_), _) => 4 
  case CC_D((CC_B(_),CC_A(_, _, _)), CC_C(CC_A(_, _, _)), _) => 5 
  case CC_D((CC_B(_),CC_B(_)), CC_C(CC_A(_, _, _)), _) => 6 
  case CC_D((CC_B(_),CC_C(_)), CC_C(CC_A(_, _, _)), _) => 7 
  case CC_E(_) => 8 
  case CC_F() => 9 
}
}
// This is not matched: CC_D((CC_B(_),CC_C(_)), CC_A(_, _, _), _)