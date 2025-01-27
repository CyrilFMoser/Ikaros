package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,T_A[Boolean]), b: Char) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: T_A[T_A[(Byte,Char)]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: (Boolean,CC_A), b: T_A[T_A[CC_B]], c: CC_B) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)