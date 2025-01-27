package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Char]], b: T_B[T_B[Char]], c: Boolean) extends T_A[T_A[T_B[Byte]]]
case class CC_B(a: T_A[CC_A], b: Boolean, c: T_A[T_A[CC_A]]) extends T_A[T_A[T_B[Byte]]]
case class CC_C(a: ((CC_B,CC_B),CC_B), b: CC_B) extends T_A[T_A[T_B[Byte]]]

val v_a: T_A[T_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, true, _) => 0 
  case CC_B(_, false, _) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_A(_, _, _)