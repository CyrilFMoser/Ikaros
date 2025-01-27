package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]], T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_A Char Char (T_A Char))