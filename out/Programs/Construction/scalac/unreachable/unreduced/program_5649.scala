package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, (T_A[Char, Char],T_A[Byte, Char])]
case class CC_B[D](a: Byte, b: CC_A[D]) extends T_A[D, (T_A[Char, Char],T_A[Byte, Char])]

val v_a: T_A[Char, (T_A[Char, Char],T_A[Byte, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}