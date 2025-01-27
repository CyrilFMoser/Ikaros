package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Byte, b: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C(a: T_A[CC_A[Byte]]) extends T_B[T_A[T_A[Boolean]]]
case class CC_D() extends T_B[T_A[T_A[Boolean]]]

val v_a: CC_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_A(_, _))) => 0 
  case CC_B(CC_B(CC_B(_))) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _))