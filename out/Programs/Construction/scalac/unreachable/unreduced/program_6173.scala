package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C(a: T_B[Char, CC_A], b: T_A, c: T_B[(Boolean,Int), (CC_B,T_A)]) extends T_A
case class CC_D[C](a: (T_B[CC_B, CC_B],Byte), b: Byte, c: CC_B) extends T_B[CC_B, C]
case class CC_E[D]() extends T_B[CC_B, D]
case class CC_F[E](a: CC_E[E], b: CC_C, c: T_B[CC_B, E]) extends T_B[CC_B, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}