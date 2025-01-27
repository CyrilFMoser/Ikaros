package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_B[T_A]], c: (T_B[T_A],Boolean)) extends T_A
case class CC_B(a: Char, b: T_B[Boolean], c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_D(), CC_A(_, _, (_,_))) => 1 
  case CC_B(_, CC_D(), CC_B('x', CC_D(), CC_A(_, _, _))) => 2 
  case CC_B(_, CC_D(), CC_B('x', CC_D(), CC_B(_, _, _))) => 3 
  case CC_B(_, CC_D(), CC_B(_, CC_D(), CC_B(_, _, _))) => 4 
  case CC_B(_, CC_D(), CC_B('x', CC_D(), CC_C())) => 5 
  case CC_B(_, CC_D(), CC_B(_, CC_D(), CC_C())) => 6 
  case CC_B(_, CC_D(), CC_C()) => 7 
  case CC_C() => 8 
}
}
// This is not matched: CC_B(_, CC_D(), CC_B(_, CC_D(), CC_A(_, _, _)))