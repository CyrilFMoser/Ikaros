package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, T_A[D]], b: Char) extends T_A[D]
case class CC_B(a: T_A[CC_A[Int]], b: Int, c: T_B[T_B[Char, Byte], T_A[Int]]) extends T_A[CC_A[Int]]
case class CC_C(a: T_A[CC_A[Int]], b: T_A[T_B[CC_B, CC_B]], c: Char) extends T_A[CC_A[Int]]
case class CC_D[E](a: E) extends T_B[((CC_C,Byte),T_A[CC_C]), E]
case class CC_E[F](a: F, b: (T_B[(Char,Int), CC_C],(CC_C,CC_B)), c: CC_C) extends T_B[((CC_C,Byte),T_A[CC_C]), F]

val v_a: T_A[CC_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}