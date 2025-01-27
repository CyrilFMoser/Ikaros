package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: C) extends T_A[Int, C]
case class CC_B[D](a: CC_A[D], b: D) extends T_A[Int, D]
case class CC_C[E]() extends T_A[Int, E]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_C() => 2 
}
}