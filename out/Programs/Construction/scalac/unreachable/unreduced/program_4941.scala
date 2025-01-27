package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[Char, C]
case class CC_B[E](a: T_A[E, E], b: T_A[Char, E], c: Boolean) extends T_A[Char, E]
case class CC_C[F]() extends T_A[Char, F]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()