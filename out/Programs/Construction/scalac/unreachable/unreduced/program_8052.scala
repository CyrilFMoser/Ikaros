package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[Byte, T_A[Char, Char]]]
case class CC_B[D]() extends T_A[D, T_A[Byte, T_A[Char, Char]]]

val v_a: T_A[Boolean, T_A[Byte, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}