package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Char) extends T_A[C]
case class CC_B[D](a: T_A[D], b: (T_A[Boolean],T_B[Boolean])) extends T_A[D]
case class CC_C[E](a: E) extends T_A[E]
case class CC_D(a: T_A[Int], b: T_A[T_A[Boolean]]) extends T_B[Byte]
case class CC_E(a: T_B[CC_C[Boolean]], b: T_B[CC_C[CC_D]], c: Char) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, _, 'x') => 1 
}
}
// This is not matched: CC_E(_, _, _)