package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[(Char,T_A), (T_A,T_A)]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_B[C, T_A], b: T_A, c: CC_B) extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(CC_A(_, _), _)