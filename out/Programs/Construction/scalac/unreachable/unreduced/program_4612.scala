package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[(CC_A,CC_A)], b: T_A[CC_A]) extends T_A[T_A[Byte]]
case class CC_C(a: Boolean, b: T_A[(CC_A,CC_A)]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)