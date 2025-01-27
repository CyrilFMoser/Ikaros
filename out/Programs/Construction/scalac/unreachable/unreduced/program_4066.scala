package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_A) extends T_A
case class CC_B(a: T_B[CC_A, T_A], b: T_A) extends T_A
case class CC_C(a: T_B[T_B[CC_A, (Byte,Boolean)], Boolean], b: Int) extends T_A
case class CC_D[C](a: T_A, b: CC_C, c: T_A) extends T_B[C, Boolean]
case class CC_E[D](a: D) extends T_B[D, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, CC_A(_, _))) => 1 
  case CC_B(_, CC_A(_, CC_B(_, _))) => 2 
  case CC_B(_, CC_A(_, CC_C(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 4 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 5 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 6 
  case CC_B(_, CC_C(CC_D(_, _, _), 12)) => 7 
  case CC_B(_, CC_C(CC_E(_), 12)) => 8 
  case CC_B(_, CC_C(CC_D(_, _, _), _)) => 9 
  case CC_B(_, CC_C(CC_E(_), _)) => 10 
  case CC_C(_, 12) => 11 
  case CC_C(_, _) => 12 
}
}