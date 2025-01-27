package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: CC_A[D]) extends T_A[D]
case class CC_C[E](a: T_A[E], b: T_B[E]) extends T_A[E]
case class CC_D(a: Int, b: CC_B[T_A[Char]], c: T_A[(Boolean,Int)]) extends T_B[CC_B[T_A[Boolean]]]

val v_a: T_B[CC_B[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(CC_A()), CC_B(CC_A())) => 0 
  case CC_D(_, CC_B(CC_A()), CC_C(_, _)) => 1 
}
}
// This is not matched: CC_D(_, CC_B(CC_A()), CC_A())