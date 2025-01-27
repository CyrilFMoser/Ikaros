package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[Boolean], T_B[T_A[Byte, Boolean]]]
case class CC_B(a: T_A[T_B[CC_A], CC_A]) extends T_A[T_B[Boolean], T_B[T_A[Byte, Boolean]]]
case class CC_C[D](a: Byte) extends T_B[D]
case class CC_D(a: CC_B) extends T_B[T_B[CC_C[CC_A]]]
case class CC_E[E](a: E, b: CC_B) extends T_B[T_B[CC_C[CC_A]]]

val v_a: T_A[T_B[Boolean], T_B[T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}