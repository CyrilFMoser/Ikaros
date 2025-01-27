package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Int]], C]
case class CC_B[D](a: D, b: T_A[D, D], c: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C[E]() extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}