package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Byte,Byte)], b: T_B[Byte]) extends T_A[T_B[Boolean]]
case class CC_B[C]() extends T_B[C]
case class CC_C() extends T_B[Byte]

val v_a: T_A[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)