package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_A[C, C]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_D Char Int (T_B Int Char))