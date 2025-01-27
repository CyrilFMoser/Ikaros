package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C[C](a: C, b: T_B[C, C]) extends T_B[C, T_B[T_A, T_B[CC_A, Byte]]]
case class CC_D[D](a: Byte, b: D, c: CC_A) extends T_B[D, T_B[T_A, T_B[CC_A, Byte]]]
case class CC_E() extends T_B[(CC_A,T_A), T_B[T_A, T_B[CC_A, Byte]]]

val v_a: T_B[T_B[(CC_A,T_A), T_B[T_A, T_B[CC_A, Byte]]], T_B[T_A, T_B[CC_A, Byte]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
}
}
// This is not matched: CC_C(_, _)