package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[Int, C]
case class CC_B[D](a: D) extends T_A[Int, D]
case class CC_C[E](a: T_A[E, E], b: T_A[Int, E]) extends T_A[Int, E]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_A(_, _)) => 2 
  case CC_C(_, CC_B(_)) => 3 
  case CC_C(_, CC_C(_, CC_A(_, _))) => 4 
  case CC_C(_, CC_C(_, CC_B(_))) => 5 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 6 
}
}