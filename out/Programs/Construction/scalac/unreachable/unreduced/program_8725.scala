package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Int], T_A]) extends T_A
case class CC_B(a: T_B[T_B[(Boolean,Boolean), (Char,Char)], Char], b: CC_A, c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: Char) extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
  case CC_B(_, CC_A(_), CC_B(_, CC_A(_), CC_A(_))) => 2 
  case CC_B(_, CC_A(_), CC_B(_, CC_A(_), CC_B(_, _, _))) => 3 
  case CC_B(_, CC_A(_), CC_B(_, CC_A(_), CC_C())) => 4 
  case CC_B(_, CC_A(_), CC_C()) => 5 
  case CC_C() => 6 
}
}