package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, T_A[T_B, T_A[(Byte,Char), T_B]]]
case class CC_B() extends T_A[T_B, T_A[T_B, T_A[(Byte,Char), T_B]]]
case class CC_C(a: T_A[(CC_B,CC_A), T_A[T_B, Char]], b: CC_A, c: T_B) extends T_A[T_B, T_A[T_B, T_A[(Byte,Char), T_B]]]
case class CC_D(a: Char) extends T_B
case class CC_E(a: (CC_C,T_A[Byte, Char])) extends T_B

val v_a: T_A[T_B, T_A[T_B, T_A[(Byte,Char), T_B]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B()