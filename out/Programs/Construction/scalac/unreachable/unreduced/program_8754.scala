package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[Byte, T_B], T_A[(Byte,Char), T_B]]
case class CC_B(a: Char, b: Int, c: T_B) extends T_A[T_A[Byte, T_B], T_A[(Byte,Char), T_B]]
case class CC_C(a: Byte, b: T_A[T_A[CC_B, T_B], CC_B], c: CC_B) extends T_A[T_A[Byte, T_B], T_A[(Byte,Char), T_B]]

val v_a: T_A[T_A[Byte, T_B], T_A[(Byte,Char), T_B]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A()