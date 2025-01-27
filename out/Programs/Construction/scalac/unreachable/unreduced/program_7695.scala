package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Int, c: D) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_B[E], b: T_A[E, T_B[E]]) extends T_A[E, T_B[E]]
case class CC_C() extends T_A[T_A[Int, T_B[Int]], T_B[T_A[Int, T_B[Int]]]]
case class CC_D(a: T_A[Int, T_B[Int]], b: CC_C) extends T_B[CC_A[T_A[Int, CC_C]]]
case class CC_E(a: T_A[CC_D, T_B[CC_D]]) extends T_B[CC_A[T_A[Int, CC_C]]]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, 12, CC_D(_, _))) => 0 
  case CC_E(CC_A(_, _, CC_D(_, _))) => 1 
  case CC_E(CC_B(_, CC_A(_, _, _))) => 2 
  case CC_E(CC_B(_, CC_B(_, _))) => 3 
}
}