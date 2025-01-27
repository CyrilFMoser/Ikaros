package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: T_A[C, C]) extends T_A[C, T_B]
case class CC_B[D]() extends T_A[D, T_B]
case class CC_C() extends T_A[Char, T_B]

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_A(CC_C(), _) => 2 
  case CC_B() => 3 
  case CC_C() => 4 
}
}