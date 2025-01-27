package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[C, C], c: T_A[Byte, C]) extends T_A[Byte, C]
case class CC_B[D]() extends T_A[Byte, D]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)