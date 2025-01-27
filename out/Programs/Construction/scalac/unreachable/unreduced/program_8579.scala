package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[(T_A[Byte],(Byte,Boolean))]
case class CC_B(a: T_B[T_B[(Char,Boolean), CC_A], CC_A], b: T_A[CC_A], c: CC_A) extends T_A[(T_A[Byte],(Byte,Boolean))]
case class CC_C() extends T_A[(T_A[Byte],(Byte,Boolean))]
case class CC_D[D](a: D, b: Byte) extends T_B[Char, D]
case class CC_E[E](a: E, b: Char) extends T_B[Char, E]
case class CC_F(a: CC_A, b: Byte) extends T_B[CC_E[CC_D[CC_A]], CC_B]

val v_a: T_A[(T_A[Byte],(Byte,Boolean))] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()