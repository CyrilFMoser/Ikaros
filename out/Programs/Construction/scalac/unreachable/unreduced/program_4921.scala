package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[Char]) extends T_A[(T_A[Byte],T_A[(Int,Byte)])]
case class CC_B[B](a: Int, b: T_A[B]) extends T_A[(T_A[Byte],T_A[(Int,Byte)])]

val v_a: T_A[(T_A[Byte],T_A[(Int,Byte)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(12, _) => 1 
  case CC_B(_, _) => 2 
}
}