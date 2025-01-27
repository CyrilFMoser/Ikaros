package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[Char, C]) extends T_A[C, T_A[Int, Char]]

val v_a: T_A[Int, T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_B Boolean Byte Wildcard (T_A Boolean Byte))