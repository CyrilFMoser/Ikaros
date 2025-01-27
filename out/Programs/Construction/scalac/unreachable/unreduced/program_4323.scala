package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: Boolean, b: CC_A[T_A[Boolean]]) extends T_B[T_A[T_A[Int]]]
case class CC_C(a: T_A[CC_A[CC_B]], b: (T_A[CC_B],T_B[CC_B]), c: CC_A[T_A[CC_B]]) extends T_B[T_A[T_A[Int]]]
case class CC_D(a: T_A[T_A[CC_B]]) extends T_B[T_A[T_A[Int]]]

val v_a: T_B[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), (CC_A(),_), _) => 0 
  case CC_D(CC_A()) => 1 
}
}
// This is not matched: CC_B(_, CC_A())