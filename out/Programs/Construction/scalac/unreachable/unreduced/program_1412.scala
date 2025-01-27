package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Byte],T_A[Byte, Byte]), b: T_A[C, C], c: C) extends T_A[T_A[T_A[Byte, Boolean], T_A[Char, Char]], C]
case class CC_B[D](a: Int, b: D, c: Boolean) extends T_A[T_A[T_A[Byte, Boolean], T_A[Char, Char]], D]
case class CC_C[E]() extends T_A[T_A[T_A[Byte, Boolean], T_A[Char, Char]], E]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Char, Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}