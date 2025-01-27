package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]]) extends T_A[T_A[T_A[Char, Boolean], Byte], C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_A(_, _) => 1 
}
}