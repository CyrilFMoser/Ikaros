package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Char, b: T_B[CC_A, T_B[Byte, T_A]], c: CC_A) extends T_A
case class CC_C(a: (T_B[CC_B, T_A],Int), b: CC_B) extends T_A
case class CC_D[C](a: C, b: CC_A) extends T_B[(T_A,CC_B), C]
case class CC_E() extends T_B[(T_A,CC_B), T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B('x', _, CC_A()) => 1 
  case CC_B(_, _, CC_A()) => 2 
  case CC_C(_, CC_B('x', _, CC_A())) => 3 
}
}
// This is not matched: CC_C(_, CC_B(_, _, CC_A()))