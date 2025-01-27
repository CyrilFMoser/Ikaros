package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[T_A, T_B[Char, Byte]], c: T_B[T_A, Boolean]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Char, b: CC_B, c: T_A) extends T_A
case class CC_D[C]() extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, CC_B(), CC_A(_, _, _)) => 1 
  case CC_C(_, CC_B(), CC_B()) => 2 
  case CC_C(_, CC_B(), CC_C(_, _, CC_A(_, _, _))) => 3 
  case CC_C(_, CC_B(), CC_C(_, _, CC_B())) => 4 
  case CC_C(_, CC_B(), CC_C(_, _, CC_C(_, _, _))) => 5 
}
}
// This is not matched: CC_B()