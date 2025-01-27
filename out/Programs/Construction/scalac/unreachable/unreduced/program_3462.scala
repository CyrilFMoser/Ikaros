package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[(Byte,Boolean), D], c: Int) extends T_A[Byte, D]
case class CC_B[E]() extends T_A[Byte, E]
case class CC_C[F]() extends T_A[Byte, F]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()