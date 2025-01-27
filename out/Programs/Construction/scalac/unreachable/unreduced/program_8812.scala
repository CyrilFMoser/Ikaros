package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[H, G](a: T_A[G, T_A[G, Char]], b: T_A[G, G]) extends T_A[G, H]
case class CC_C[J, I](a: T_A[J, I], b: CC_B[I, I], c: (CC_A[Int, Char],CC_A[Int, Boolean])) extends T_A[J, I]
case class CC_D(a: T_A[CC_B[Int, Char], CC_B[Char, Byte]], b: Int) extends T_B[Int, (CC_A[Int, Char],CC_C[Char, Byte])]
case class CC_E[K](a: T_A[K, K], b: K, c: K) extends T_B[(CC_A[CC_D, CC_D],CC_B[Boolean, CC_D]), K]
case class CC_F(a: T_B[CC_D, T_B[CC_D, CC_D]], b: CC_A[T_A[CC_D, Byte], Int]) extends T_B[Int, (CC_A[Int, Char],CC_C[Char, Byte])]

val v_a: T_B[(CC_A[CC_D, CC_D],CC_B[Boolean, CC_D]), T_B[Int, (CC_A[Int, Char],CC_C[Char, Byte])]] = null
val v_b: Int = v_a match{
  case CC_E(_, _, CC_D(CC_B(_, _), _)) => 0 
  case CC_E(_, _, CC_D(CC_C(_, _, _), _)) => 1 
  case CC_E(_, _, CC_F(_, CC_A())) => 2 
}
}
// This is not matched: CC_E(_, _, CC_D(CC_A(), _))