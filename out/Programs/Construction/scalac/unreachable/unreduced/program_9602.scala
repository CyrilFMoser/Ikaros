package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Boolean, b: CC_A, c: CC_A) extends T_A
case class CC_D[C](a: CC_C, b: T_B[C, T_B[C, C]], c: CC_B) extends T_B[C, T_B[C, C]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, CC_A(_, CC_B(), CC_A(_, _, _))) => 2 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), CC_A(_, _, _))) => 3 
  case CC_C(_, _, CC_A(_, CC_A(_, _, _), CC_B())) => 4 
  case CC_C(_, _, CC_A(_, CC_B(), CC_B())) => 5 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), CC_B())) => 6 
  case CC_C(_, _, CC_A(_, CC_A(_, _, _), CC_C(_, _, _))) => 7 
  case CC_C(_, _, CC_A(_, CC_B(), CC_C(_, _, _))) => 8 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), CC_C(_, _, _))) => 9 
}
}
// This is not matched: CC_C(_, _, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)))