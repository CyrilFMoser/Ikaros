package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: (T_B[Boolean],T_A[Boolean, Byte]), b: Byte, c: T_A[E, D]) extends T_A[D, Byte]
case class CC_B[F](a: T_A[F, F]) extends T_A[F, Byte]
case class CC_C[G](a: G) extends T_A[G, Byte]
case class CC_D[H](a: (T_B[Byte],T_A[Int, Int]), b: (CC_A[(Char,Char), Boolean],Byte)) extends T_B[H]
case class CC_E[I]() extends T_B[I]
case class CC_F[J](a: CC_B[J]) extends T_B[T_B[CC_D[Boolean]]]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_, _),CC_A(_, _, _)), _, _) => 0 
  case CC_A((CC_D(_, _),CC_B(_)), _, _) => 1 
  case CC_A((CC_D(_, _),CC_C(_)), _, _) => 2 
  case CC_A((CC_E(),CC_B(_)), _, _) => 3 
  case CC_A((CC_E(),CC_C(_)), _, _) => 4 
  case CC_B(_) => 5 
  case CC_C(_) => 6 
}
}
// This is not matched: CC_A((CC_E(),CC_A(_, _, _)), _, _)