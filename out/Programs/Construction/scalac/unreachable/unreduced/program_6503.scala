package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: Int, c: T_A[T_A[Int]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[T_A[Int]], b: T_A[T_A[CC_A]], c: T_A[CC_A]) extends T_A[CC_A]
case class CC_C[B]() extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}