package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C[E](a: Boolean, b: Int) extends T_A[T_A[E, E], E]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}