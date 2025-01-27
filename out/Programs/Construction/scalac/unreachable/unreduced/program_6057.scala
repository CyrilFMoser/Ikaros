package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[(T_A[Int, (Byte,Int)],Byte), C]
case class CC_B[D](a: T_A[D, D], b: Int, c: T_A[D, D]) extends T_A[(T_A[Int, (Byte,Int)],Byte), D]
case class CC_C[E](a: E) extends T_A[(T_A[Int, (Byte,Int)],Byte), E]

val v_a: T_A[(T_A[Int, (Byte,Int)],Byte), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_) => 3 
}
}