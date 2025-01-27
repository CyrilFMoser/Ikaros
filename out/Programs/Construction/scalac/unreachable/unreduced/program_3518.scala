package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[Byte, C]]) extends T_A[C, T_A[(Int,Char), Int]]
case class CC_B[D](a: D) extends T_A[D, T_A[(Int,Char), Int]]

val v_a: T_A[Char, T_A[(Int,Char), Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}