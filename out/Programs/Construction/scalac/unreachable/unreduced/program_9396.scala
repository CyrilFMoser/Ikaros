package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Boolean, c: T_B[D]) extends T_A[Int, D]
case class CC_B[E](a: T_A[Int, E], b: CC_A[T_A[Int, E]], c: E) extends T_A[Int, E]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}