package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: (Byte,Byte), b: T_A[C]) extends T_A[C]
case class CC_C[E]() extends T_A[E]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_A T_B Boolean))