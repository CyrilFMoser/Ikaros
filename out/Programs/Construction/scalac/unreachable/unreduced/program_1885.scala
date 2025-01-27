package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: CC_A, b: T_A[CC_A]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: T_A[T_A[Byte]], b: Boolean, c: (T_A[Int],Boolean)) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}
// This is not matched: CC_C(_, _, _)