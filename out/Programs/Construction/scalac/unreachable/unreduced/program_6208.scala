package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, F], b: Byte) extends T_A[E, F]
case class CC_B[G, H](a: CC_A[G, T_A[G, G]], b: Char, c: T_A[H, G]) extends T_A[G, H]
case class CC_C[I](a: T_A[I, I], b: CC_A[I, I]) extends T_B[T_A[T_A[Byte, Char], Boolean], I]
case class CC_D[J](a: J, b: (T_A[(Boolean,Int), Byte],CC_C[Int]), c: Char) extends T_B[T_A[T_A[Byte, Char], Boolean], J]
case class CC_E[K](a: CC_D[K], b: T_A[K, K], c: T_A[K, K]) extends T_B[T_A[T_A[Byte, Char], Boolean], K]

val v_a: T_B[T_A[T_A[Byte, Char], Boolean], Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_C(CC_B(_, _, _), CC_A(_, _)) => 1 
  case CC_D(_, (CC_A(_, _),CC_C(_, _)), _) => 2 
  case CC_D(_, (CC_B(_, _, _),CC_C(_, _)), _) => 3 
  case CC_E(_, _, CC_A(_, _)) => 4 
  case CC_E(_, _, CC_B(_, _, _)) => 5 
}
}