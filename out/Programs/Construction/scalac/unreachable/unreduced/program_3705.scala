package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[CC_A[Byte]]) extends T_B[Char]
case class CC_C() extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}