package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Int, D], b: D, c: D) extends T_A[Int, D]
case class CC_B[E](a: Int, b: T_A[E, E]) extends T_A[Int, E]
case class CC_C[F]() extends T_B[F]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_, _), _, _) => 1 
  case CC_B(_, _) => 2 
}
}