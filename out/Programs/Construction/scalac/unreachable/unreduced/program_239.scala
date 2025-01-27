package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[Int], c: T_A[(Int,Int)]) extends T_A[T_A[T_A[Int]]]
case class CC_B[B](a: T_A[B], b: B, c: T_A[T_A[B]]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_B[(CC_A,CC_A)], b: T_A[Boolean]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)