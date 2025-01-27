package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char, b: T_A[Byte, Boolean]) extends T_A[T_A[Int, Boolean], T_A[Char, Char]]

val v_a: T_A[T_A[Int, Boolean], T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_B Boolean (T_A (T_A Int Boolean) (T_A Char Char)))