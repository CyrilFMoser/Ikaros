package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Int, C]
case class CC_B[D](a: T_A[D, T_A[Int, D]], b: Int, c: T_A[D, D]) extends T_A[Int, D]
case class CC_C[E]() extends T_A[Int, E]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}