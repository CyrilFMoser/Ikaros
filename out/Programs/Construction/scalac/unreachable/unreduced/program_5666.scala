package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_B[Byte], b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: (CC_B,CC_B), b: T_A[CC_A[Char]], c: CC_B) extends T_A[T_A[T_A[Boolean]]]
case class CC_D(a: T_A[Char], b: T_B[T_A[CC_C]]) extends T_B[T_A[CC_C]]
case class CC_E(a: T_A[CC_D]) extends T_B[T_A[CC_C]]
case class CC_F(a: (T_A[CC_E],Int), b: T_B[T_A[CC_C]], c: T_B[T_A[CC_C]]) extends T_B[T_A[CC_C]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_C((CC_B(_, _),CC_B(_, _)), CC_A(), CC_B(_, CC_A())) => 2 
}
}