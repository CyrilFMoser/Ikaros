package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[(Boolean,Byte), T_B[(Char,Boolean)]], b: T_A[T_A[Byte, Int], T_B[Char]], c: T_B[T_B[Int]]) extends T_A[T_A[T_B[Byte], (Int,Int)], T_A[Byte, T_A[Int, Int]]]
case class CC_B[D](a: CC_A, b: T_B[D]) extends T_A[D, T_A[T_B[CC_A], T_A[CC_A, CC_A]]]
case class CC_C[E](a: T_B[E], b: T_B[E], c: CC_B[E]) extends T_A[E, T_A[T_B[CC_A], T_A[CC_A, CC_A]]]
case class CC_D[F](a: T_A[F, F], b: T_B[F]) extends T_B[F]
case class CC_E[G](a: Boolean, b: T_B[G]) extends T_B[G]
case class CC_F[H](a: T_B[H], b: T_A[H, H]) extends T_B[H]

val v_a: T_A[CC_A, T_A[T_B[CC_A], T_A[CC_A, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D(_, _)) => 0 
  case CC_B(_, CC_E(_, CC_D(_, _))) => 1 
  case CC_B(_, CC_E(_, CC_E(_, _))) => 2 
  case CC_B(_, CC_E(_, CC_F(_, _))) => 3 
  case CC_B(_, CC_F(_, _)) => 4 
  case CC_C(_, _, _) => 5 
}
}