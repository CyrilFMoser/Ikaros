package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Char, b: T_B[T_A[Boolean, Boolean]], c: (T_B[Char],T_A[Int, Char])) extends T_A[T_B[(Byte,Byte)], (Char,T_A[Byte, Boolean])]
case class CC_B(a: (Int,(CC_A,CC_A))) extends T_A[T_B[(Byte,Byte)], (Char,T_A[Byte, Boolean])]
case class CC_C(a: T_A[T_B[Byte], CC_A], b: T_A[T_B[Boolean], CC_B], c: CC_B) extends T_A[T_B[(Byte,Byte)], (Char,T_A[Byte, Boolean])]
case class CC_D[D]() extends T_B[D]
case class CC_E[E](a: CC_C, b: T_A[E, E]) extends T_B[E]

val v_a: T_A[T_B[(Byte,Byte)], (Char,T_A[Byte, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)