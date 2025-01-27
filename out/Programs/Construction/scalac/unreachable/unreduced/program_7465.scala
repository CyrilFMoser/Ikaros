package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, Char]
case class CC_B[D](a: D) extends T_A[D, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(0) => 1 
}
}
// This is not matched: CC_B(_)