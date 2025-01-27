package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: T_A[Int, Boolean]) extends T_A[T_A[Byte, Char], T_A[Char, Byte]]

val v_a: T_A[T_A[Byte, Char], T_A[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_B Wildcard (T_A (T_A Byte)))