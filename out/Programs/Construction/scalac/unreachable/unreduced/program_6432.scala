package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, Int], b: T_A[C, C]) extends T_A[C, Int]
case class CC_B[D]() extends T_A[D, Int]
case class CC_C[E]() extends T_A[E, Int]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(), _), _) => 1 
  case CC_A(CC_A(CC_C(), _), _) => 2 
  case CC_A(CC_B(), _) => 3 
  case CC_A(CC_C(), _) => 4 
  case CC_B() => 5 
  case CC_C() => 6 
}
}