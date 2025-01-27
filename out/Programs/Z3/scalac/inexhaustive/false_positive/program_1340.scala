package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B[E, D, F]() extends T_A[E, D]
case class CC_C(a: T_A[(Byte,Byte), Boolean], b: T_B, c: CC_B[T_B, Byte, Char]) extends T_B

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B Byte Byte T_B (T_A Byte Byte))
// This is not matched: (CC_B Byte Byte T_B (T_A Byte Byte))