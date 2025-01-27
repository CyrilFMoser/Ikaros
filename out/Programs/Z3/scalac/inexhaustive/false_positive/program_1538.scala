package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[Char]]
case class CC_C[C](a: Char, b: T_A[C]) extends T_B[C]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C('x', _) => 0 
}
}
// This is not matched: Pattern match is empty without constants