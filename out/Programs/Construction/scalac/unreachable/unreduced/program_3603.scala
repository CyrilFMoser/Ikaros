package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[T_A[Char, Boolean], T_A[(Char,Int), Boolean]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Char, Boolean], T_A[(Char,Int), Boolean]], D]
case class CC_C[E](a: E) extends T_A[CC_B[E], E]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[(Char,Int), Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}