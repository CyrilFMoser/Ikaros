package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[Byte, D]
case class CC_B[E](a: T_A[Byte, E], b: T_A[Byte, E], c: E) extends T_A[Byte, E]
case class CC_C(a: T_B[T_A[Byte, Char]], b: CC_A[T_B[Char]]) extends T_B[(T_A[Byte, Int],T_A[Char, Int])]
case class CC_D(a: T_A[T_A[Byte, (Int,Char)], CC_C]) extends T_B[(T_A[Byte, Int],T_A[Char, Int])]
case class CC_E(a: CC_D) extends T_B[(T_A[Byte, Int],T_A[Char, Int])]

val v_a: T_B[(T_A[Byte, Int],T_A[Char, Int])] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_D(_)