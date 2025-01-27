package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[D], D]
case class CC_B[E](a: T_A[E, Byte], b: T_B[E]) extends T_B[E]
case class CC_C[F]() extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(_, CC_C()) => 1 
}
}
// This is not matched: Pattern match is empty without constants