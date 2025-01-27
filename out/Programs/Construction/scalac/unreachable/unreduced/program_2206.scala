package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: (T_A[Boolean, Boolean],T_A[Boolean, Int])) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Byte, b: T_A[D, T_A[D, D]], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, CC_A(CC_A(_, _), _), _) => 1 
  case CC_B(_, CC_A(CC_B(_, _, _), _), _) => 2 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), _) => 3 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_B(_, _, _)), _) => 4 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), _) => 5 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), _) => 6 
}
}