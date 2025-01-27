package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: Byte, b: T_A, c: T_A) extends T_A
case class CC_B(a: T_B[T_B[Char]], b: T_B[Char]) extends T_A
case class CC_C(a: T_B[CC_A[T_A]], b: CC_B) extends T_B[Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _), CC_A(_, _, _)), _) => 1 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_, _)), _) => 2 
  case CC_A(_, CC_A(_, CC_B(_, _), CC_B(_, _)), _) => 3 
  case CC_A(_, CC_B(_, _), _) => 4 
  case CC_B(_, _) => 5 
}
}