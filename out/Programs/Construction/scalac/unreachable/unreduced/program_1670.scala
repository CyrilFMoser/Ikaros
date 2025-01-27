package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Char, (Boolean,Int)], T_A[Char, Boolean]]]
case class CC_B[D](a: D, b: Boolean) extends T_A[D, T_A[T_A[Char, (Boolean,Int)], T_A[Char, Boolean]]]
case class CC_C(a: T_A[CC_A[Byte], T_A[Byte, (Byte,Char)]], b: T_A[CC_A[Byte], CC_A[Int]]) extends T_A[(T_A[(Boolean,Byte), Int],CC_B[Int]), T_A[T_A[Char, (Boolean,Int)], T_A[Char, Boolean]]]

val v_a: T_A[(T_A[(Boolean,Byte), Int],CC_B[Int]), T_A[T_A[Char, (Boolean,Int)], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}