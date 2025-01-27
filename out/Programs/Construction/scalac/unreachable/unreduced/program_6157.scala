package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_B[D]], b: (T_A[Byte, (Byte,Boolean)],T_A[(Boolean,Byte), Byte]), c: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_A[E, T_B[E]]) extends T_A[E, T_B[E]]
case class CC_C[F](a: CC_B[F], b: (CC_B[Char],CC_B[Int]), c: T_A[F, T_B[F]]) extends T_B[F]
case class CC_D[G](a: T_A[G, T_B[G]]) extends T_B[G]
case class CC_E[H]() extends T_B[H]

val v_a: T_A[Byte, T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _, _)))