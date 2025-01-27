package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[Char, Boolean], C]

val v_a: T_A[T_A[Char, Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_C Int Wildcard Wildcard (T_A Int Byte))