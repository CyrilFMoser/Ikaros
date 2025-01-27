package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: T_A[C, Char]) extends T_A[C, Char]
case class CC_B(a: CC_A[T_A[T_B, Char]], b: Boolean) extends T_B
case class CC_C(a: CC_B, b: T_A[Byte, Char]) extends T_B
case class CC_D(a: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_A(_, _)) => 1 
  case CC_D(CC_B(_, _)) => 2 
}
}