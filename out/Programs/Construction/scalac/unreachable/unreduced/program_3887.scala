package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[(T_A[Char, Boolean],T_A[Int, Int]), C]
case class CC_B(a: Byte, b: Byte) extends T_A[(T_A[Char, Boolean],T_A[Int, Int]), T_A[CC_A[Byte], CC_A[Byte]]]
case class CC_C[D](a: CC_B, b: CC_A[D]) extends T_A[(T_A[Char, Boolean],T_A[Int, Int]), D]

val v_a: T_A[(T_A[Char, Boolean],T_A[Int, Int]), T_A[CC_A[Byte], CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(0, _) => 1 
  case CC_C(CC_B(0, _), CC_A(_)) => 2 
  case CC_C(CC_B(_, _), CC_A(_)) => 3 
}
}
// This is not matched: CC_B(_, _)