package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_A[T_A[Char, Char], T_A[Int, Char]], T_A[Byte, T_B[Byte]]]
case class CC_B(a: CC_A, b: CC_A, c: T_B[T_B[CC_A]]) extends T_A[T_A[T_A[Char, Char], T_A[Int, Char]], T_A[Byte, T_B[Byte]]]
case class CC_C[D, E](a: T_A[E, T_B[E]]) extends T_B[D]
case class CC_D[F]() extends T_B[F]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
}
}