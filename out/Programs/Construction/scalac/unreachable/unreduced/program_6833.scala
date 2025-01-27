package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte, c: C) extends T_A[T_A[T_A[Char, Int], T_A[Char, Byte]], C]
case class CC_B[D, E]() extends T_A[T_A[T_A[Char, Int], T_A[Char, Byte]], D]
case class CC_C[F, G]() extends T_A[T_A[T_A[Char, Int], T_A[Char, Byte]], F]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Char, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}