package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[T_A[Byte]], c: Byte) extends T_A[(T_A[Char],(Byte,Byte))]
case class CC_B(a: T_A[(CC_A,CC_A)], b: T_A[CC_A]) extends T_A[(T_A[Char],(Byte,Byte))]
case class CC_C() extends T_A[(T_A[Char],(Byte,Byte))]

val v_a: T_A[(T_A[Char],(Byte,Byte))] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)