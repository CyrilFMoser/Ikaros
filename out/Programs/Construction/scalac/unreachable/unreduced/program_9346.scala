package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Boolean]], b: T_A[(Int,Byte)], c: T_A[(Boolean,Char)]) extends T_A[(T_A[Boolean],T_A[(Byte,Int)])]
case class CC_B() extends T_A[(T_A[Boolean],T_A[(Byte,Int)])]

val v_a: T_A[(T_A[Boolean],T_A[(Byte,Int)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}