package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, C]) extends T_A[C, (T_A[Char, Boolean],Byte)]
case class CC_B[D]() extends T_A[D, (T_A[Char, Boolean],Byte)]

val v_a: T_A[Char, (T_A[Char, Boolean],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}