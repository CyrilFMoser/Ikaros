package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[T_A[E, Byte], E]) extends T_A[E, T_A[E, E]]
case class CC_B[F]() extends T_A[F, T_A[F, F]]
case class CC_C[G](a: T_B[G, G]) extends T_A[G, T_A[G, G]]
case class CC_D[I, H](a: CC_C[H], b: T_A[T_A[I, I], H]) extends T_B[H, I]
case class CC_E[J, K, L](a: L) extends T_B[K, J]
case class CC_F(a: T_A[CC_A[Boolean], T_A[CC_A[Boolean], CC_A[Boolean]]], b: T_A[T_B[Byte, Byte], T_A[T_B[Byte, Byte], T_B[Byte, Byte]]], c: T_B[CC_A[Byte], CC_B[Int]]) extends T_B[(Byte,CC_D[(Int,Byte), Boolean]), T_A[(Byte,Char), T_A[(Byte,Char), (Byte,Char)]]]

val v_a: T_B[(Byte,CC_D[(Int,Byte), Boolean]), T_A[(Byte,Char), T_A[(Byte,Char), (Byte,Char)]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_), _) => 0 
  case CC_E(_) => 1 
  case CC_F(_, CC_A(_), _) => 2 
  case CC_F(_, CC_B(), _) => 3 
  case CC_F(_, CC_C(_), _) => 4 
}
}