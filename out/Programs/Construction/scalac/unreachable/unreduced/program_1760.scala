package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, (T_A[Byte, Boolean],T_A[Char, Int])]
case class CC_B[D](a: T_A[D, D], b: CC_A[D], c: T_A[D, D]) extends T_A[D, (T_A[Byte, Boolean],T_A[Char, Int])]
case class CC_C[E](a: CC_B[E], b: CC_B[T_A[E, E]], c: Boolean) extends T_A[CC_B[(Boolean,Byte)], E]

val v_a: T_A[Char, (T_A[Byte, Boolean],T_A[Char, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
}
}