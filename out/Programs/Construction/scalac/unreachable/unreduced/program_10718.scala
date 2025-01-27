package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[T_A[C, D], C]) extends T_A[Byte, C]
case class CC_B[E]() extends T_A[Byte, E]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}