package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, T_A[Byte, E]]) extends T_A[D, T_A[Byte, D]]
case class CC_B(a: (Boolean,(Char,Byte)), b: (T_B[Int],CC_A[Byte, Byte]), c: Boolean) extends T_A[(T_A[Int, Boolean],Int), T_A[Byte, (T_A[Int, Boolean],Int)]]
case class CC_C[F](a: Char) extends T_A[F, T_A[Byte, F]]
case class CC_D[G, H](a: (CC_A[(Char,Char), CC_B],CC_B), b: H) extends T_B[G]
case class CC_E[I]() extends T_B[I]
case class CC_F[J](a: T_B[Int], b: T_A[J, J], c: T_A[J, T_A[Byte, J]]) extends T_B[J]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D((CC_A(_),CC_B(_, _, _)), _) => 0 
  case CC_E() => 1 
  case CC_F(CC_D((_,_), _), _, CC_A(_)) => 2 
  case CC_F(CC_E(), _, CC_A(_)) => 3 
  case CC_F(CC_F(_, _, _), _, CC_A(_)) => 4 
  case CC_F(CC_D((_,_), _), _, CC_C(_)) => 5 
  case CC_F(CC_E(), _, CC_C(_)) => 6 
  case CC_F(CC_F(_, _, _), _, CC_C(_)) => 7 
}
}