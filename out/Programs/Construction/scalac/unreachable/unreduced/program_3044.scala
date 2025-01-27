package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A], b: T_A, c: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_C) extends T_B[C, CC_A]
case class CC_E[D](a: CC_D[D], b: Char) extends T_B[D, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(CC_A(_, _, _))) => 1 
  case CC_A(_, _, CC_B(CC_B(_))) => 2 
  case CC_A(_, _, CC_B(CC_C())) => 3 
  case CC_A(_, _, CC_C()) => 4 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 5 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_B(_))) => 6 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_C())) => 7 
  case CC_B(CC_A(_, CC_B(_), CC_A(_, _, _))) => 8 
  case CC_B(CC_A(_, CC_B(_), CC_B(_))) => 9 
  case CC_B(CC_A(_, CC_B(_), CC_C())) => 10 
  case CC_B(CC_A(_, CC_C(), CC_A(_, _, _))) => 11 
  case CC_B(CC_A(_, CC_C(), CC_B(_))) => 12 
  case CC_B(CC_A(_, CC_C(), CC_C())) => 13 
  case CC_B(CC_B(CC_A(_, _, _))) => 14 
  case CC_B(CC_B(CC_B(_))) => 15 
  case CC_B(CC_B(CC_C())) => 16 
  case CC_B(CC_C()) => 17 
  case CC_C() => 18 
}
}