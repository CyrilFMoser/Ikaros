package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: Boolean) extends T_A[D]
case class CC_B[E](a: Char, b: CC_A[E], c: T_B[E, E]) extends T_A[E]
case class CC_C() extends T_B[Byte, T_A[T_B[Int, Int]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(CC_B(_, CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), _), _) => 1 
  case CC_A(CC_A(_, _, _), CC_A(_, CC_B(_, _, _), _), _) => 2 
  case CC_A(CC_B(_, CC_A(_, _, _), _), CC_A(_, CC_B(_, _, _), _), _) => 3 
  case CC_A(CC_A(_, _, _), CC_B(_, _, _), _) => 4 
  case CC_A(CC_B(_, CC_A(_, _, _), _), CC_B(_, _, _), _) => 5 
  case CC_B(_, _, _) => 6 
}
}