package Program_62 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[Int, T_B[Boolean, Char]], E]
case class CC_D[I, J](a: T_A[I, I], b: I) extends T_B[I, J]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_D(_, 12) => 0 
}
}
// This is not matched: CC_D(_, _, _)