package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_B[T_B[Int]], b: T_B[T_B[Boolean]]) extends T_B[T_A[T_B[Int]]]
case class CC_C(a: CC_A[T_B[CC_B]], b: CC_A[T_B[CC_B]], c: T_A[Char]) extends T_B[T_A[T_B[Int]]]
case class CC_D(a: CC_A[CC_C], b: T_A[T_A[CC_B]]) extends T_B[T_A[T_B[Int]]]

val v_a: T_B[T_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(), CC_A(), _) => 1 
}
}
// This is not matched: CC_D(CC_A(), CC_A())