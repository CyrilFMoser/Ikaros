package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C]) extends T_A[D, C]

val v_a: CC_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
}
}