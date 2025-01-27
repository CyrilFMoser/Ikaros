package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: T_A[Char, T_A[Char, Char]]) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_))) => 1 
  case CC_B(CC_C(CC_A(_, _))) => 2 
}
}