package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E, F](a: T_B[E, T_A[E]], b: T_A[F]) extends T_A[E]
case class CC_C[G](a: CC_A[G], b: ((Int,Boolean),T_A[Int])) extends T_A[G]
case class CC_D[H]() extends T_B[H, T_B[T_A[Byte], T_A[Int]]]
case class CC_E(a: CC_A[CC_A[Char]], b: T_A[T_A[Boolean]], c: T_B[Byte, T_A[Boolean]]) extends T_B[T_A[T_A[Char]], T_B[T_A[Byte], T_A[Int]]]
case class CC_F(a: T_A[CC_A[CC_E]], b: CC_B[T_A[CC_E], Char], c: (CC_E,T_B[CC_E, Boolean])) extends T_B[T_A[T_A[Char]], T_B[T_A[Byte], T_A[Int]]]

val v_a: T_A[CC_E] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_), ((_,_),CC_B(_, _))) => 2 
  case CC_C(CC_A(_), ((_,_),CC_C(_, _))) => 3 
}
}
// This is not matched: CC_C(CC_A(_), ((_,_),CC_A(_)))