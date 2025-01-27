package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_B[T_A[Int, Boolean]], D]
case class CC_B[E](a: CC_A[E], b: T_A[E, E], c: T_A[E, E]) extends T_A[T_B[T_A[Int, Boolean]], E]

val v_a: T_A[T_B[T_A[Int, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, _) => 1 
}
}