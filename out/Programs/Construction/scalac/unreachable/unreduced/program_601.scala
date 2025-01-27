package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[Byte], c: T_B[T_B[Byte, Int], T_B[Byte, Int]]) extends T_A[(Char,T_A[Boolean])]
case class CC_B(a: T_B[((Int,Char),CC_A), T_A[CC_A]]) extends T_A[(Char,T_A[Boolean])]
case class CC_C[D](a: CC_B, b: T_A[D]) extends T_A[(Char,T_A[Boolean])]

val v_a: T_A[(Char,T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}