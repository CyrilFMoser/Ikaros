package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Int],T_A[(Boolean,Int), Boolean]), b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Int, b: T_A[D, T_A[D, D]], c: D) extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A((_,_), _), 12) => 1 
  case CC_B(_, CC_B(_, CC_A(_, _), _), 12) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), 12) => 3 
  case CC_B(_, CC_A((_,_), _), _) => 4 
  case CC_B(_, CC_B(_, CC_A(_, _), _), _) => 5 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_B(_, _, _), _), _)