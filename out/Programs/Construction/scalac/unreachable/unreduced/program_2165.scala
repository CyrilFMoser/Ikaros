package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[Boolean]]]
case class CC_B(a: T_A[Byte]) extends T_A[T_B[T_B[Boolean]]]
case class CC_C() extends T_A[T_B[T_B[Boolean]]]

val v_a: T_A[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}