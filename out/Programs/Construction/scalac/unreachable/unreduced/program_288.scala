package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Int, Char], Int], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D]) extends T_A[T_A[T_A[Int, Char], Int], D]
case class CC_C[E](a: E, b: T_A[E, E], c: Byte) extends T_A[T_A[T_A[Int, Char], Int], E]

val v_a: T_A[T_A[T_A[Int, Char], Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}