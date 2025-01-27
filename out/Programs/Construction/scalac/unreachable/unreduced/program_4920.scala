package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: C) extends T_A[Byte, C]
case class CC_B[D](a: D) extends T_A[Byte, D]
case class CC_C[E]() extends T_A[E, (T_A[Char, Int],CC_A[Byte])]

val v_a: T_A[Byte, (T_A[Char, Int],CC_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,CC_A(_, _))) => 1 
}
}
// This is not matched: CC_C()