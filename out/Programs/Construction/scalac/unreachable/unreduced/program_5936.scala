package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_B[T_A[Boolean]]]

val v_a: T_A[T_B[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}