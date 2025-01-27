package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E]) extends T_A[Byte, D]
case class CC_B(a: T_A[Byte, T_B[Char]], b: Byte, c: T_A[Int, Boolean]) extends T_A[Byte, CC_A[T_A[Boolean, Byte], Char]]
case class CC_C[F]() extends T_A[Byte, CC_A[T_A[Boolean, Byte], Char]]

val v_a: T_A[Byte, CC_A[T_A[Boolean, Byte], Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)