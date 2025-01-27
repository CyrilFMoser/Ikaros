package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[Int], c: Char) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_A, b: CC_A, c: (CC_A,CC_B)) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)