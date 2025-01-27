package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(T_A[Byte, Byte],T_A[(Byte,Byte), Int]), C]
case class CC_B[D](a: T_A[D, D]) extends T_A[(T_A[Byte, Byte],T_A[(Byte,Byte), Int]), D]
case class CC_C[E](a: CC_B[E], b: CC_A[E], c: E) extends T_A[(T_A[Byte, Byte],T_A[(Byte,Byte), Int]), E]

val v_a: T_A[(T_A[Byte, Byte],T_A[(Byte,Byte), Int]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, _, _)