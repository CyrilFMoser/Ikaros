package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B, c: T_B) extends T_A[C, T_B]
case class CC_B[D]() extends T_A[D, T_B]
case class CC_C[E](a: T_A[E, CC_A[E]]) extends T_A[Int, T_B]
case class CC_D(a: Boolean, b: CC_C[(T_B,T_B)], c: T_A[CC_B[T_B], T_B]) extends T_B

val v_a: T_A[T_A[Int, T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(true, CC_C(_), _)) => 0 
  case CC_A(_, _, CC_D(false, CC_C(_), _)) => 1 
  case CC_B() => 2 
}
}