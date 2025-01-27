package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[(T_A[(Boolean,Char), Boolean],T_A[Char, Int]), C]
case class CC_B[D](a: T_A[CC_A[D], D]) extends T_A[(T_A[(Boolean,Char), Boolean],T_A[Char, Int]), D]
case class CC_C() extends T_A[(T_A[(Boolean,Char), Boolean],T_A[Char, Int]), T_A[T_A[Byte, Int], T_A[Char, Byte]]]

val v_a: T_A[(T_A[(Boolean,Char), Boolean],T_A[Char, Int]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}