package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, (T_A[Byte, Char],Char)]
case class CC_B[D]() extends T_A[T_A[CC_A[Boolean], T_A[Boolean, Boolean]], D]
case class CC_C[E](a: CC_A[E], b: T_A[CC_B[E], E]) extends T_A[T_A[CC_A[Boolean], T_A[Boolean, Boolean]], E]

val v_a: T_A[T_A[CC_A[Boolean], T_A[Boolean, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_), _) => 1 
}
}