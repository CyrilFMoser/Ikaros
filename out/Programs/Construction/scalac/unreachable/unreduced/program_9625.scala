package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Boolean]]) extends T_A[Char]
case class CC_B[C](a: Byte, b: T_A[C]) extends T_B[C]
case class CC_C[D](a: D, b: D, c: T_B[Char]) extends T_B[D]
case class CC_D(a: T_A[Char], b: Byte) extends T_B[(T_B[CC_A],T_A[Boolean])]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _)) => 0 
  case CC_A(CC_C(_, _, _)) => 1 
}
}