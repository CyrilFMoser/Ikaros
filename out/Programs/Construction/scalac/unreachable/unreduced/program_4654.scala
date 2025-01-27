package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[T_A[B]], b: B) extends T_A[(T_A[Boolean],Byte)]
case class CC_B[C](a: C, b: C) extends T_A[(T_A[Boolean],Byte)]

val v_a: T_A[(T_A[Boolean],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}