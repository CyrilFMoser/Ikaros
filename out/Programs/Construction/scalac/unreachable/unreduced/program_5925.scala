package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Boolean]]]
case class CC_B[C](a: T_B[C], b: T_A[C], c: T_B[C]) extends T_B[C]
case class CC_C() extends T_B[T_B[T_B[CC_A]]]
case class CC_D(a: Byte, b: Byte, c: CC_A) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(_, _, CC_A()) => 1 
}
}
// This is not matched: CC_C()