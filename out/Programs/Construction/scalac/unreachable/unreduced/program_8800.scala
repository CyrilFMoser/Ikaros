package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: Int) extends T_A[C, Int]
case class CC_B(a: T_A[T_A[Byte, Boolean], Int], b: CC_A[T_A[Boolean, Int]]) extends T_A[T_A[T_A[Char, Char], Int], Int]
case class CC_C() extends T_A[T_A[T_A[Char, Char], Int], Int]

val v_a: T_A[T_A[T_A[T_A[Char, Char], Int], Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_B(CC_A(_, _, _), CC_A(_, _, _)), _) => 1 
  case CC_A(_, CC_C(), _) => 2 
}
}