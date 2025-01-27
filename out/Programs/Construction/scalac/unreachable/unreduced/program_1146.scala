package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[Int]
case class CC_B[D](a: T_B[D, D]) extends T_A[D]
case class CC_C() extends T_A[Boolean]
case class CC_D[E](a: T_A[Boolean], b: (T_A[Boolean],CC_C)) extends T_B[T_B[T_A[Boolean], T_A[CC_A]], E]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}