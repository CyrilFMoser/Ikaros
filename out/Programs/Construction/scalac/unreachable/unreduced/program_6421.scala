package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[Byte, C]
case class CC_B(a: T_A[Byte, T_A[Byte, Char]]) extends T_A[Byte, Char]
case class CC_C[D](a: Int, b: CC_A[D], c: T_A[Byte, D]) extends T_A[Byte, D]

val v_a: T_A[Byte, CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}