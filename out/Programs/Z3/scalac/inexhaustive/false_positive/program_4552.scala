package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[(Boolean,Byte), (Int,Int)], b: T_B[CC_A, T_A]) extends T_A
case class CC_D[C, D]() extends T_B[C, D]
case class CC_E[F, E]() extends T_B[F, E]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_E()) => 0 
}
}
// This is not matched: (CC_B T_A T_A)