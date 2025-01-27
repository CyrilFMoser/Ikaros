package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_B[Boolean]]]
case class CC_B[C](a: CC_A) extends T_A[T_A[T_B[Boolean]]]
case class CC_C(a: T_B[CC_A], b: T_A[Boolean]) extends T_A[T_A[T_B[Boolean]]]

val v_a: T_A[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()