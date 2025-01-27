package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Boolean]]) extends T_A[T_B[T_B[Byte]]]
case class CC_B(a: Byte) extends T_A[T_B[T_B[Byte]]]
case class CC_C() extends T_A[T_B[T_B[Byte]]]
case class CC_D(a: T_B[CC_A]) extends T_B[Boolean]
case class CC_E[C](a: CC_D) extends T_B[C]

val v_a: T_A[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()