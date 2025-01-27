package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Int],T_A[Byte, Int]), b: C, c: T_A[C, C]) extends T_A[(T_A[(Char,Boolean), Byte],T_A[Boolean, Int]), C]
case class CC_B(a: Boolean, b: CC_A[CC_A[Int]]) extends T_A[(T_A[(Char,Boolean), Byte],T_A[Boolean, Int]), T_A[CC_A[Boolean], CC_A[Byte]]]

val v_a: T_A[(T_A[(Char,Boolean), Byte],T_A[Boolean, Int]), T_A[CC_A[Boolean], CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_, _) => 1 
}
}