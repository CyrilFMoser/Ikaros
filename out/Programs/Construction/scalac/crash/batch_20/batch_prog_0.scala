package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Char, b: (T_A[Char],T_A[T_B]), c: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D](a: T_B, b: T_A[D], c: T_A[D]) extends T_A[D]

val v_a: CC_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}