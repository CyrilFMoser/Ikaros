package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: C, c: T_A[T_A[C, Boolean], C]) extends T_A[C, (Char,T_A[Char, Byte])]
case class CC_B[D]() extends T_A[D, (Char,T_A[Char, Byte])]

val v_a: T_A[Char, (Char,T_A[Char, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}