package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Char],Char)) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (CC_A[Byte],((Boolean,Char),(Byte,Byte))), b: T_A[D, T_A[D, D]], c: CC_A[D]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, CC_A((_,_)), _) => 1 
  case CC_B(_, CC_B((_,_), CC_A(_), CC_A(_)), _) => 2 
  case CC_B(_, CC_B((_,_), CC_B(_, _, _), CC_A(_)), _) => 3 
}
}