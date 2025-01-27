package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, T_A[T_B, ((Int,Byte),T_B)]]
case class CC_B[D, E]() extends T_A[D, E]
case class CC_D() extends T_B
case class CC_E() extends T_B
case class CC_F(a: (CC_B[CC_E, Char, CC_D],((Int,Boolean),CC_D)), b: CC_A[T_A[T_B, CC_D]]) extends T_B

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F(_, CC_A(CC_E())) => 0 
}
}
// This is not matched: CC_A(CC_A(_))