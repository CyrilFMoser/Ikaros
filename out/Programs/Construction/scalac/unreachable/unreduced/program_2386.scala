package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_A[Int, Char], T_A[(Boolean,Boolean), (Int,Char)]], b: T_A[(Char,Boolean), T_B[Char]], c: T_B[(Char,Boolean)]) extends T_A[T_A[T_B[Int], T_A[(Boolean,Boolean), Boolean]], T_B[T_A[(Int,Char), Byte]]]
case class CC_B(a: Char, b: Int) extends T_A[T_A[T_B[Int], T_A[(Boolean,Boolean), Boolean]], T_B[T_A[(Int,Char), Byte]]]
case class CC_C[D](a: Boolean, b: T_A[T_B[T_A[CC_A, CC_A]], T_A[CC_A, CC_A]], c: Boolean) extends T_A[T_B[D], D]
case class CC_D[F]() extends T_B[F]
case class CC_E[G](a: (T_B[CC_B],CC_B), b: G, c: T_A[G, G]) extends T_B[G]
case class CC_F[H](a: CC_D[H], b: T_B[H]) extends T_B[H]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E((CC_D(),CC_B(_, _)), _, _) => 1 
  case CC_E((CC_E(_, _, _),CC_B(_, _)), _, _) => 2 
  case CC_E((CC_F(_, _),CC_B(_, _)), _, _) => 3 
  case CC_F(CC_D(), CC_D()) => 4 
  case CC_F(CC_D(), CC_E(_, _, _)) => 5 
  case CC_F(CC_D(), CC_F(_, CC_D())) => 6 
  case CC_F(CC_D(), CC_F(_, CC_E(_, _, _))) => 7 
}
}
// This is not matched: CC_F(CC_D(), CC_F(_, CC_F(_, _)))