package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, (Byte,Int)]

val v_a: T_A[Char, (Byte,Int)] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_B (T_A (T_A Int Byte) (T_A Boolean Char)))