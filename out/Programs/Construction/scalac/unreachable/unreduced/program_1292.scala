package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[T_B[T_B[Int]], D]
case class CC_B[E](a: T_A[E, E], b: E) extends T_A[T_B[T_B[Int]], E]

val v_a: T_A[T_B[T_B[Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}