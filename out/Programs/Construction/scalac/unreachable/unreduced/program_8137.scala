package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: (T_A[Char],T_A[Char]), b: Boolean) extends T_A[F]
case class CC_D[G](a: T_A[G], b: CC_C[G]) extends T_B[G, T_A[T_A[Int]]]
case class CC_E(a: Boolean) extends T_B[CC_D[(Char,Byte)], T_A[T_A[Int]]]
case class CC_F[H](a: H) extends T_B[H, T_A[T_A[Int]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C((CC_A(_),CC_A(_)), _) => 2 
  case CC_C((CC_A(_),CC_B()), _) => 3 
  case CC_C((CC_A(_),CC_C(_, _)), _) => 4 
  case CC_C((CC_B(),CC_A(_)), _) => 5 
  case CC_C((CC_B(),CC_B()), _) => 6 
  case CC_C((CC_C(_, _),CC_A(_)), _) => 7 
  case CC_C((CC_C(_, _),CC_B()), _) => 8 
  case CC_C((CC_C(_, _),CC_C(_, _)), _) => 9 
}
}
// This is not matched: CC_C((CC_B(),CC_C(_, _)), _)