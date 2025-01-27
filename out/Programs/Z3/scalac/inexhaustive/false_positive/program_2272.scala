package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[Char]) extends T_A[T_A[(Int,Byte)]]

val v_a: T_A[T_A[(Int,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_B Byte (CC_B Byte Wildcard Byte (T_A Byte)) Wildcard (T_A Byte))