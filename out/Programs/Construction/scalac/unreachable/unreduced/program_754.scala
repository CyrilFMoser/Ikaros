package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_B[Boolean]], c: T_A[Byte]) extends T_A[(T_A[(Byte,Int)],T_A[Char])]
case class CC_B(a: Byte, b: T_B[CC_A]) extends T_A[(T_A[(Byte,Int)],T_A[Char])]
case class CC_C() extends T_A[(T_A[(Byte,Int)],T_A[Char])]
case class CC_D[C](a: Char, b: CC_B) extends T_B[C]
case class CC_E[D](a: (T_B[CC_C],CC_D[CC_A]), b: CC_C, c: D) extends T_B[D]
case class CC_F[E](a: CC_D[E], b: T_B[E], c: CC_E[E]) extends T_B[E]

val v_a: T_A[(T_A[(Byte,Int)],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}