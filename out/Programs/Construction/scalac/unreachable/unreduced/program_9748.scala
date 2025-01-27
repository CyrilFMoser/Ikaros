package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: Boolean, c: Int) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: Boolean, c: CC_A[E]) extends T_A[E]
case class CC_C() extends T_A[Int]
case class CC_D(a: T_A[Int], b: (T_A[CC_C],CC_C)) extends T_B[T_A[Int], T_B[CC_C, CC_C]]
case class CC_E[F](a: CC_B[F], b: T_B[F, F], c: Byte) extends T_B[F, T_A[F]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, true, _) => 1 
  case CC_B(_, false, _) => 2 
}
}
// This is not matched: CC_C()