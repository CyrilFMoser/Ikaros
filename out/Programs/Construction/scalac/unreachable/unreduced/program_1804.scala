package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[CC_A[D], D]
case class CC_C[E](a: T_A[E, E], b: E) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_C(_, _)) => 1 
  case CC_C(_, _) => 2 
}
}