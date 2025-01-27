package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: E) extends T_A[T_B[T_B[Char, Char], T_A[Char, Int]], E]
case class CC_B[F]() extends T_A[T_B[T_B[Char, Char], T_A[Char, Int]], F]
case class CC_C[G](a: CC_B[G], b: T_B[G, G], c: T_A[G, G]) extends T_A[G, (CC_A[Char],CC_A[Byte])]
case class CC_D[H, I](a: T_A[I, H], b: T_B[H, Byte], c: Int) extends T_B[H, I]
case class CC_E[K, J](a: K, b: Char) extends T_B[J, K]
case class CC_F(a: T_B[Byte, CC_E[Char, Byte]]) extends T_B[T_A[CC_D[Int, Boolean], Byte], CC_C[CC_C[Char]]]

val v_a: T_B[T_A[CC_D[Int, Boolean], Byte], CC_C[CC_C[Char]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, CC_D(_, _, _), 12), _) => 0 
  case CC_D(_, CC_D(_, CC_E(_, _), 12), _) => 1 
  case CC_D(_, CC_D(_, CC_D(_, _, _), _), _) => 2 
  case CC_D(_, CC_D(_, CC_E(_, _), _), _) => 3 
  case CC_D(_, CC_E(_, _), _) => 4 
  case CC_E(_, _) => 5 
  case CC_F(CC_D(_, _, _)) => 6 
  case CC_F(CC_E(CC_E(_, _), _)) => 7 
}
}