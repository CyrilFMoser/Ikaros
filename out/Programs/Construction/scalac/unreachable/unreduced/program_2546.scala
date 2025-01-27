package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[F, F], b: T_B[F, F]) extends T_A[F, E]
case class CC_B[G](a: G, b: G, c: CC_A[G, G]) extends T_A[Int, G]
case class CC_C[H](a: T_A[T_A[H, H], H], b: (CC_B[(Int,Byte)],Byte), c: Int) extends T_A[T_A[H, H], H]
case class CC_D[I](a: T_A[I, I], b: CC_C[I]) extends T_B[I, CC_C[T_A[Int, Char]]]
case class CC_E[J]() extends T_B[J, CC_C[T_A[Int, Char]]]

val v_a: T_B[Byte, CC_C[T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), CC_C(CC_A(_, _), (_,_), _)) => 0 
  case CC_D(CC_A(_, _), CC_C(CC_C(_, _, _), (_,_), _)) => 1 
  case CC_E() => 2 
}
}