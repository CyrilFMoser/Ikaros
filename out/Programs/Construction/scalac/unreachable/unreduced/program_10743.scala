package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[D, T_A[T_A[D, D], D]]
case class CC_C[E]() extends T_A[E, CC_A[T_A[Char, Byte]]]

val v_a: T_A[Boolean, T_A[T_A[Boolean, Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(true, _) => 1 
  case CC_B(false, _) => 2 
}
}