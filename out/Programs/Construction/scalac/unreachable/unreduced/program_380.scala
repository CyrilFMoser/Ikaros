package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_A, b: T_A[CC_A]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _)