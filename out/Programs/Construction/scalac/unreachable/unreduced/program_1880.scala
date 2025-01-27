package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Char, (Int,Byte)], T_A[Byte, Byte]], b: T_A[T_A[Char, Int], T_B[Byte, Byte]], c: T_A[Int, (Int,Int)]) extends T_A[Byte, T_A[T_A[Int, Byte], Char]]
case class CC_B[F, E](a: T_A[F, E], b: F) extends T_A[F, E]
case class CC_C[G](a: T_B[G, G], b: T_A[G, G]) extends T_B[G, Byte]

val v_a: T_A[Byte, T_A[T_A[Int, Byte], Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_B(CC_B(_, _), _) => 1 
}
}
// This is not matched: CC_A(_, _, _)