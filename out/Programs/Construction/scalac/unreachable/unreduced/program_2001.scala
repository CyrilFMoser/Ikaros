package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[T_A[Byte, T_A[Char, Boolean]], C]
case class CC_B[D](a: CC_A[D]) extends T_A[T_A[Byte, T_A[Char, Boolean]], D]
case class CC_C[E](a: (CC_A[Byte],CC_A[Int]), b: T_A[E, E], c: Char) extends T_A[T_A[Byte, T_A[Char, Boolean]], E]

val v_a: T_A[T_A[Byte, T_A[Char, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)