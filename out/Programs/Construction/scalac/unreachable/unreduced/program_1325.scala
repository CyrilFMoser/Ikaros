package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_B, (Char,T_B)]) extends T_A[C, T_B]
case class CC_B[D]() extends T_A[D, T_B]
case class CC_C[E](a: T_A[E, E], b: (Boolean,CC_B[Char]), c: CC_B[E]) extends T_A[E, T_A[T_A[T_B, T_B], T_B]]
case class CC_D(a: CC_C[Char], b: Int) extends T_B
case class CC_E(a: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _, _), 12) => 0 
  case CC_D(CC_C(_, _, _), _) => 1 
  case CC_E(CC_D(_, _)) => 2 
}
}