package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[T_A[Byte, Int], Char], C]
case class CC_B[E]() extends T_A[T_A[T_A[Byte, Int], Char], E]

val v_a: T_A[T_A[T_A[Byte, Int], Char], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}