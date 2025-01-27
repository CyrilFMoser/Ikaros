package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: T_B[CC_A, CC_B], b: Char, c: CC_B) extends T_A
case class CC_D[C](a: CC_A, b: CC_B, c: T_B[(CC_A,CC_A), C]) extends T_B[C, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(CC_A(), CC_A())) => 2 
  case CC_B(_, CC_B(CC_B(_, _), CC_A())) => 3 
  case CC_B(_, CC_B(CC_C(_, _, _), CC_A())) => 4 
  case CC_B(_, CC_B(CC_A(), CC_B(_, _))) => 5 
  case CC_B(_, CC_B(CC_B(_, _), CC_B(_, _))) => 6 
  case CC_B(_, CC_B(CC_C(_, _, _), CC_B(_, _))) => 7 
  case CC_B(_, CC_B(CC_A(), CC_C(_, _, _))) => 8 
  case CC_B(_, CC_B(CC_B(_, _), CC_C(_, _, _))) => 9 
  case CC_B(_, CC_B(CC_C(_, _, _), CC_C(_, _, _))) => 10 
  case CC_B(_, CC_C(_, _, _)) => 11 
}
}
// This is not matched: CC_C(_, _, CC_B(_, _))