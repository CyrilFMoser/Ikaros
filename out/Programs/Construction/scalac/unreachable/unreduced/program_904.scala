package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Boolean, b: T_A[D, C], c: T_A[D, D]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], C]
case class CC_B[E](a: T_A[E, E]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], E]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}