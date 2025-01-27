package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[Byte, D], T_A[Byte, Byte]], b: Byte, c: T_B[D]) extends T_A[Byte, D]
case class CC_B[E](a: T_A[Byte, E]) extends T_A[Byte, E]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_B(_)) => 2 
}
}