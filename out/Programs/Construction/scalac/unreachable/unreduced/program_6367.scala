package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[Char, T_B[Byte, Char]], E]
case class CC_B(a: CC_A[Int], b: T_A[Int, Int]) extends T_A[T_B[Char, T_B[Byte, Char]], CC_A[T_B[Char, (Int,Char)]]]
case class CC_C(a: Int, b: T_A[CC_B, CC_B], c: T_B[((Int,Byte),CC_B), CC_B]) extends T_A[T_B[Char, T_B[Byte, Char]], CC_A[T_B[Char, (Int,Char)]]]
case class CC_D[F](a: T_B[F, CC_C], b: F) extends T_B[F, CC_C]
case class CC_E[G](a: CC_A[G], b: CC_B, c: CC_C) extends T_B[G, CC_C]

val v_a: T_A[T_B[Char, T_B[Byte, Char]], CC_A[T_B[Char, (Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _)