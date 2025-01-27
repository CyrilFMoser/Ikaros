package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: ((Char,(Int,Int)),T_A[Boolean, (Byte,Byte)]), c: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: Boolean, c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), (_,_), _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_A(CC_B(_, _, _), (_,_), _)