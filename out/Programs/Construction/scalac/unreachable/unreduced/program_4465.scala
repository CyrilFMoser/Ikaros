package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, T_B[Char]], c: D) extends T_A[D, T_B[Char]]
case class CC_B[F, E, G]() extends T_A[E, F]
case class CC_C[H](a: T_A[(Byte,(Boolean,Int)), T_B[Char]], b: T_A[H, H]) extends T_A[H, T_B[Char]]
case class CC_D(a: T_B[T_A[Byte, Char]], b: T_A[(Byte,Boolean), T_B[Char]], c: CC_A[Char]) extends T_B[T_A[Int, T_B[Char]]]
case class CC_E(a: Boolean) extends T_B[T_A[Int, T_B[Char]]]
case class CC_F(a: CC_E) extends T_B[T_A[Int, T_B[Char]]]

val v_a: T_B[T_A[Int, T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_F(CC_E(_))