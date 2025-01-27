package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[(T_A[Int, Int],T_A[Int, Boolean]), C]
case class CC_B(a: CC_A[CC_A[Char]], b: CC_A[T_A[Byte, (Char,Byte)]], c: Int) extends T_A[(T_A[Int, Int],T_A[Int, Boolean]), ((Boolean,Int),T_A[Boolean, Char])]
case class CC_C(a: Char) extends T_A[(T_A[Int, Int],T_A[Int, Boolean]), T_A[CC_A[Int], T_A[CC_B, CC_B]]]

val v_a: T_A[(T_A[Int, Int],T_A[Int, Boolean]), T_A[CC_A[Int], T_A[CC_B, CC_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C('x') => 1 
}
}
// This is not matched: CC_C(_)