package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[T_A[(Byte,Byte)]], c: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: T_A[(CC_A,CC_A)]) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_B, b: CC_B) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}