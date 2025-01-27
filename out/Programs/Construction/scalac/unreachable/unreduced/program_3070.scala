package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_B[(Char,Int), Boolean], T_A[Byte, Byte]], b: T_A[Char, T_B[Int, Byte]], c: T_B[T_B[Byte, (Int,Char)], T_B[Boolean, Int]]) extends T_A[T_A[T_B[Char, Char], Boolean], T_B[T_A[(Int,Boolean), Boolean], T_B[Boolean, Boolean]]]
case class CC_B(a: T_A[T_A[Char, CC_A], Byte], b: T_A[T_A[CC_A, (Byte,Char)], T_A[CC_A, CC_A]], c: T_B[T_B[CC_A, CC_A], T_B[Char, (Int,Int)]]) extends T_A[T_A[T_B[Char, Char], Boolean], T_B[T_A[(Int,Boolean), Boolean], T_B[Boolean, Boolean]]]
case class CC_C[E, F](a: T_B[F, E]) extends T_A[E, F]
case class CC_D[G](a: CC_A, b: Boolean) extends T_B[T_A[CC_A, CC_C[CC_B, CC_A]], G]
case class CC_E[H](a: (T_B[CC_B, (Byte,Int)],CC_A)) extends T_B[H, CC_B]
case class CC_F[I](a: T_A[I, I], b: CC_B) extends T_B[T_A[CC_A, CC_C[CC_B, CC_A]], I]

val v_a: T_B[T_A[CC_A, CC_C[CC_B, CC_A]], CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_F(_, CC_B(_, CC_C(_), _)) => 1 
}
}
// This is not matched: CC_E(_)