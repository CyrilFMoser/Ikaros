package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Boolean],Byte), b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[Int], b: T_A[D, T_A[D, D]], c: CC_A[D]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_A(_, _)) => 0 
  case CC_A((_,_), CC_B(_, _, _)) => 1 
  case CC_B(CC_A(_, _), _, CC_A(_, _)) => 2 
}
}