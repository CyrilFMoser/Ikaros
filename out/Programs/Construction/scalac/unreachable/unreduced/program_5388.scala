package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Char) extends T_A
case class CC_B(a: Int, b: (CC_A,T_B[CC_A, T_A]), c: T_A) extends T_A
case class CC_C(a: T_B[CC_A, Int], b: T_A) extends T_B[T_B[T_A, CC_B], Boolean]
case class CC_D(a: T_B[T_B[T_A, CC_C], CC_C], b: CC_A, c: CC_C) extends T_B[T_B[T_A, CC_B], Boolean]
case class CC_E() extends T_B[T_B[T_A, CC_B], Boolean]

val v_a: T_B[T_B[T_A, CC_B], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, _, _)) => 0 
  case CC_D(_, CC_A(CC_A(_, _), _), CC_C(_, CC_A(_, _))) => 1 
  case CC_D(_, CC_A(CC_A(_, _), _), CC_C(_, CC_B(_, _, _))) => 2 
  case CC_D(_, CC_A(CC_B(_, _, _), _), CC_C(_, CC_A(_, _))) => 3 
  case CC_D(_, CC_A(CC_B(_, _, _), _), CC_C(_, CC_B(_, _, _))) => 4 
  case CC_E() => 5 
}
}
// This is not matched: CC_C(_, CC_A(_, _))