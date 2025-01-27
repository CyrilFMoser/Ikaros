package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[Byte], D]
case class CC_B[E]() extends T_A[T_B[Byte], E]

val v_a: T_A[T_B[Byte], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}