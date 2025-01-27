package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte, c: T_A[C, C]) extends T_A[C, T_A[Byte, (Char,Boolean)]]
case class CC_B[D]() extends T_A[D, T_A[Byte, (Char,Boolean)]]
case class CC_C[E](a: Char, b: Char) extends T_A[T_A[E, CC_A[E]], E]

val v_a: T_A[T_A[T_A[Byte, (Char,Boolean)], CC_A[T_A[Byte, (Char,Boolean)]]], T_A[Byte, (Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}