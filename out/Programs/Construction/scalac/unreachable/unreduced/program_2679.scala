package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Byte,T_A[Char, Char]), b: Byte) extends T_A[(T_A[Byte, Int],T_A[Char, Boolean]), T_A[T_A[Byte, Byte], T_A[Char, Char]]]
case class CC_B(a: Boolean) extends T_A[(T_A[Byte, Int],T_A[Char, Boolean]), T_A[T_A[Byte, Byte], T_A[Char, Char]]]

val v_a: T_A[(T_A[Byte, Int],T_A[Char, Boolean]), T_A[T_A[Byte, Byte], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), 0) => 0 
  case CC_A((_,_), _) => 1 
  case CC_B(_) => 2 
}
}