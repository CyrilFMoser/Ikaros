package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[Char]
case class CC_B(a: ((Boolean,CC_A),CC_A), b: Byte, c: T_A[T_A[CC_A]]) extends T_A[(CC_A,(CC_A,CC_A))]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}