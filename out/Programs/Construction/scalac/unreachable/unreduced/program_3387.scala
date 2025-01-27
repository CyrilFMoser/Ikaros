package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B) extends T_A[C, Char]
case class CC_B() extends T_A[T_A[Boolean, Char], Char]
case class CC_C(a: T_A[Byte, T_A[CC_B, CC_B]], b: T_A[T_A[Boolean, Char], Char]) extends T_A[T_A[Boolean, Char], Char]
case class CC_D(a: Int, b: Byte, c: Byte) extends T_B
case class CC_E(a: T_A[(CC_D,CC_D), Char], b: Boolean, c: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, 0) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E(CC_A(_, CC_D(_, _, _)), _, _) => 2 
  case CC_E(CC_A(_, CC_E(_, _, _)), _, _) => 3 
}
}