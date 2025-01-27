package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int) extends T_A[Int]
case class CC_B(a: T_A[CC_A], b: (T_A[Int],T_A[CC_A]), c: T_A[T_B[CC_A, CC_A]]) extends T_A[Int]
case class CC_C[D]() extends T_B[D, CC_B]
case class CC_D[E](a: Boolean, b: T_B[E, Char], c: Boolean) extends T_B[T_A[E], E]

val v_a: T_B[T_A[CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}