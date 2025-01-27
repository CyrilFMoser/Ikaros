package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[(T_A[Char, Byte],T_A[Int, Byte]), C]
case class CC_B[D](a: D, b: T_A[D, D], c: T_A[D, D]) extends T_A[(T_A[Char, Byte],T_A[Int, Byte]), T_A[CC_A[Char], CC_A[Byte]]]

val v_a: T_A[(T_A[Char, Byte],T_A[Int, Byte]), T_A[CC_A[Char], CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}