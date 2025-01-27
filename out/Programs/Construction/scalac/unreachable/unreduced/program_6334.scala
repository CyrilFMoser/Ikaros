package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_A[D, D]]
case class CC_B(a: T_A[CC_A[Byte], CC_A[(Byte,Byte)]], b: (((Byte,Byte),Boolean),T_B[Boolean]), c: CC_A[Boolean]) extends T_A[Boolean, T_A[Boolean, Boolean]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}