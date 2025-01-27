package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Int, T_A[Int, Char]], C]
case class CC_B[D](a: T_A[D, D], b: CC_A[D], c: CC_A[CC_A[D]]) extends T_A[T_A[Int, T_A[Int, Char]], D]
case class CC_C(a: Byte, b: CC_A[CC_B[Boolean]]) extends T_A[T_A[Int, T_A[Int, Char]], CC_A[T_A[Boolean, Boolean]]]

val v_a: T_A[T_A[Int, T_A[Int, Char]], CC_A[T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_C(_, CC_A()) => 2 
}
}