package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B], c: T_A[T_B]) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_A[T_B], b: T_B, c: Boolean) extends T_A[T_A[T_A[T_B]]]
case class CC_C() extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: CC_B) extends T_B
case class CC_E(a: CC_C) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D(CC_B(_, _, _)), true) => 0 
  case CC_B(_, CC_E(CC_C()), true) => 1 
  case CC_B(_, CC_D(CC_B(_, _, _)), false) => 2 
  case CC_B(_, CC_E(CC_C()), false) => 3 
  case CC_C() => 4 
}
}
// This is not matched: CC_A(_, _, _)