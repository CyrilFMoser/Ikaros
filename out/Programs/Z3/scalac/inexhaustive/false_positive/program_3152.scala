package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C(a: T_A[Char, Char]) extends T_B[T_A[Int, Byte], T_A[Char, Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
}
}
// This is not matched: Pattern match is empty without constants