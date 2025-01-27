package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[T_B[Char, Byte], T_A[Byte, Int]], E]
case class CC_B(a: CC_A[T_A[Int, Byte]], b: T_A[T_B[Boolean, Byte], T_A[Boolean, Byte]]) extends T_A[T_A[T_B[Char, Byte], T_A[Byte, Int]], Int]
case class CC_C[F](a: T_B[F, F], b: F) extends T_A[Byte, F]
case class CC_D[G, H]() extends T_B[G, H]

val v_a: T_A[T_A[T_B[Char, Byte], T_A[Byte, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}