package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), Boolean], b: T_B[T_B[T_A, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: Char) extends T_A
case class CC_D(a: CC_A, b: CC_A, c: (CC_C,T_A)) extends T_B[Byte, T_B[CC_A, Boolean]]
case class CC_E[C](a: Int) extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(CC_A(_, _), _) => 1 
  case CC_C(CC_B(), _) => 2 
  case CC_C(CC_C(_, _), _) => 3 
}
}
// This is not matched: CC_B()