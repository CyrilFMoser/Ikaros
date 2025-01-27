package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: T_A[C, T_A[Char, T_B]], c: Byte) extends T_A[C, T_A[Char, T_B]]
case class CC_B(a: CC_A[(T_B,T_B)], b: (Char,Int)) extends T_A[CC_A[T_A[(Char,Byte), T_B]], T_A[Char, T_B]]
case class CC_C[D](a: (T_A[CC_B, T_B],(CC_B,(Byte,Byte))), b: (Int,CC_B)) extends T_A[D, T_A[Char, T_B]]

val v_a: T_A[Boolean, T_A[Char, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), 0) => 0 
  case CC_A(_, CC_A(_, _, _), _) => 1 
  case CC_A(_, CC_C(_, _), 0) => 2 
  case CC_C((_,(_,_)), _) => 3 
}
}
// This is not matched: CC_A(_, CC_C(_, _), _)