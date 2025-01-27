package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, Boolean]
case class CC_B[D](a: T_A[D, D], b: CC_A[D]) extends T_A[D, Boolean]
case class CC_C[E]() extends T_A[E, Boolean]
case class CC_D(a: Int, b: CC_B[CC_B[T_B]]) extends T_B

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}