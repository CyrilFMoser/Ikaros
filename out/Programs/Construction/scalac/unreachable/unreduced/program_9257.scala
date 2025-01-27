package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]], c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C(a: Int, b: T_A[(Boolean,Byte), T_A[(Boolean,Byte), (Boolean,Byte)]], c: CC_B[CC_A[(Char,Byte)]]) extends T_A[Int, T_A[Int, Int]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)