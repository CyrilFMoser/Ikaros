package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[Byte, E], b: T_A[Byte, E]) extends T_A[Byte, E]
case class CC_B(a: T_A[T_A[Byte, Int], T_A[Byte, Byte]], b: T_A[Byte, Int], c: Char) extends T_A[Byte, Int]
case class CC_C[F](a: T_A[Byte, Int]) extends T_B[Byte, F]

val v_a: T_B[Byte, T_A[Byte, Int]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_A(_, _))) => 0 
  case CC_C(CC_A(_, CC_B(_, _, _))) => 1 
  case CC_C(CC_B(_, _, _)) => 2 
}
}