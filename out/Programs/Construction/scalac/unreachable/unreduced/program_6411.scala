package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C]) extends T_A[C, (T_A[T_B, T_B],Int)]
case class CC_B(a: T_B, b: T_A[(T_B,T_B), (T_B,Char)], c: T_A[Byte, Char]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[Int, CC_B], b: CC_C, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_C(), CC_C()) => 1 
}
}
// This is not matched: CC_B(_, _, _)