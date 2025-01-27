package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], T_A[Byte, Byte]], c: Char) extends T_A[T_A[C, C], C]
case class CC_B[E](a: T_A[T_A[CC_A[T_A[(Byte,Boolean), Char]], CC_A[T_A[(Byte,Boolean), Char]]], CC_A[T_A[(Byte,Boolean), Char]]]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_), _), _) => 1 
  case CC_A(_, CC_B(CC_A(_, _, _)), _) => 2 
  case CC_A(_, CC_B(CC_B(_)), _) => 3 
  case CC_B(CC_A(_, CC_A(_, _, _), _)) => 4 
  case CC_B(CC_A(_, CC_B(_), _)) => 5 
  case CC_B(CC_B(_)) => 6 
}
}