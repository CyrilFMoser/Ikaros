package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Boolean]]) extends T_A[(T_A[Int],T_A[(Char,Byte)])]
case class CC_B() extends T_A[(T_A[Int],T_A[(Char,Byte)])]

val v_a: T_A[(T_A[Int],T_A[(Char,Byte)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}