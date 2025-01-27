package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: Int, b: T_A, c: C) extends T_A
case class CC_B() extends T_A
case class CC_C[D](a: D, b: CC_A[D], c: T_B[D, D]) extends T_B[T_B[CC_A[T_A], Int], D]
case class CC_D[E]() extends T_B[T_B[CC_A[T_A], Int], E]

val v_a: T_B[T_B[CC_A[T_A], Int], Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_C(_, CC_A(_, CC_B(), _), _) => 1 
  case CC_D() => 2 
}
}