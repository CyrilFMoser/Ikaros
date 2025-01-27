package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[T_A[Boolean, Char], Char]]
case class CC_B[F](a: (T_A[Byte, Byte],T_B[(Char,Int), Char]), b: F, c: T_A[F, F]) extends T_A[F, T_B[T_A[Boolean, Char], Char]]
case class CC_C() extends T_A[Boolean, T_B[T_A[Boolean, Char], Char]]

val v_a: T_A[Boolean, T_B[T_A[Boolean, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C()