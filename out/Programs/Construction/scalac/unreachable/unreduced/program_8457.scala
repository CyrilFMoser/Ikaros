package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, T_A[T_A[Byte, Byte], T_A[Char, Char]]]
case class CC_B(a: Boolean, b: CC_A[T_A[Byte, (Int,Byte)]], c: T_A[CC_A[Byte], CC_A[(Byte,Char)]]) extends T_A[CC_A[CC_A[Boolean]], T_A[T_A[Byte, Byte], T_A[Char, Char]]]

val v_a: T_A[CC_A[CC_A[Boolean]], T_A[T_A[Byte, Byte], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
}
}