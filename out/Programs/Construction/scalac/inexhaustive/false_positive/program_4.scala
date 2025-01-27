package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_B[D], c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_D[F]() extends T_B[T_A[F]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_E(_)