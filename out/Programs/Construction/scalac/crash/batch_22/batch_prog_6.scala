package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A, b: (CC_A,CC_A)) extends T_A[T_A[T_A[Int]]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}