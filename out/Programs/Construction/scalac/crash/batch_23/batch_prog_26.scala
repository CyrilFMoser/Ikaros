package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: E, b: CC_B[E], c: T_A[E]) extends T_A[E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), _) => 0 
  case CC_A(_, CC_A(_, _, CC_B()), _) => 1 
  case CC_A(_, CC_A(_, _, CC_C(_, _, _)), _) => 2 
  case CC_A(_, CC_B(), _) => 3 
  case CC_A(_, CC_C(_, _, _), _) => 4 
  case CC_B() => 5 
  case CC_C(_, CC_B(), _) => 6 
}
}