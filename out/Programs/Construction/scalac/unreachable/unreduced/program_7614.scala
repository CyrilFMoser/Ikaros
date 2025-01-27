package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]], b: T_A) extends T_A
case class CC_B(a: T_B[CC_A, T_B[T_A, Byte]], b: T_A, c: T_B[T_A, T_B[Byte, Int]]) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[Byte, CC_B]
case class CC_E[C](a: T_A, b: T_B[C, C], c: T_A) extends T_B[(T_B[CC_D, CC_C],CC_C), C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_B(_, CC_A(_, _), _), _) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 2 
  case CC_B(_, CC_B(_, CC_C(), _), _) => 3 
  case CC_B(_, CC_C(), _) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_B(_, CC_A(_, _), _)