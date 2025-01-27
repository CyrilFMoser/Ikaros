package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[T_A[Byte]], b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_A[(CC_B,CC_B)]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A()) => 2 
}
}