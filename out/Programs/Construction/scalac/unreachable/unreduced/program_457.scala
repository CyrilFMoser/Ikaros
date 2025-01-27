package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_B, c: T_A[B]) extends T_A[T_A[T_A[(Byte,Byte)]]]
case class CC_B(a: T_B, b: T_A[CC_A[T_B]], c: T_A[(Char,T_B)]) extends T_A[T_A[T_A[(Byte,Byte)]]]
case class CC_C() extends T_A[T_A[T_A[(Byte,Byte)]]]

val v_a: T_A[T_A[T_A[(Byte,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)