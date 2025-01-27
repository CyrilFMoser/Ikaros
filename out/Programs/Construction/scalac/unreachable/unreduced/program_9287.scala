package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, T_A[D, D]], c: Char) extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, CC_A(_, _), _), _) => 1 
  case CC_A(CC_B(_, CC_B(_, _, _), _), _) => 2 
  case CC_B(_, CC_A(_, _), _) => 3 
  case CC_B(_, CC_B(_, CC_A(_, _), _), _) => 4 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 5 
}
}