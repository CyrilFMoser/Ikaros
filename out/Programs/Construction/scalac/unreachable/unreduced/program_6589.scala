package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Char]) extends T_A[C, Char]
case class CC_B[D]() extends T_A[D, Char]
case class CC_C[E]() extends T_A[E, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B())) => 1 
  case CC_A(_, CC_A(_, CC_C())) => 2 
  case CC_A(_, CC_B()) => 3 
  case CC_A(_, CC_C()) => 4 
  case CC_B() => 5 
  case CC_C() => 6 
}
}