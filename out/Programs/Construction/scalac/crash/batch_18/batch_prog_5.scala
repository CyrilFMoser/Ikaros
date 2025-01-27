package Program_5 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,Char), b: T_A) extends T_A
case class CC_B(a: CC_A, b: Boolean, c: Char) extends T_A
case class CC_C() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_C())) => 2 
  case CC_A(_, CC_B(CC_A(_, _), _, _)) => 3 
  case CC_A(_, CC_C()) => 4 
  case CC_B(CC_A(_, _), _, _) => 5 
  case CC_C() => 6 
}
}