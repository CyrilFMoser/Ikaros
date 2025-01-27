package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Char]], b: (T_A[Boolean, (Byte,Int)],T_A[Char, Char]), c: T_A[T_A[Int, Int], T_B[Byte]]) extends T_A[T_B[T_A[Byte, Byte]], Int]
case class CC_B(a: Byte) extends T_A[T_B[T_A[Byte, Byte]], Int]
case class CC_C(a: (Byte,T_A[CC_B, CC_A]), b: T_B[T_A[Char, CC_B]]) extends T_A[T_B[T_A[Byte, Byte]], Int]
case class CC_D[D](a: CC_A, b: D, c: T_A[D, D]) extends T_B[D]
case class CC_E[E](a: CC_D[E], b: CC_D[T_A[(Int,Byte), E]]) extends T_B[E]
case class CC_F[F](a: F, b: Byte) extends T_B[F]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_D(CC_A(_, _, _), _, _)) => 0 
  case CC_F(_, _) => 1 
}
}
// This is not matched: CC_D(_, _, _)