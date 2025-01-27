package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[Byte, T_A[Char, Int]]]
case class CC_B[D]() extends T_A[D, T_A[Byte, T_A[Char, Int]]]

val v_a: T_A[Char, T_A[Byte, T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}