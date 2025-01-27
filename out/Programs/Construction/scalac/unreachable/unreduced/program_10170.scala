package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[Byte, T_A[Byte, Byte]]]
case class CC_B(a: Boolean) extends T_A[CC_A[CC_A[Char]], T_A[Byte, T_A[Byte, Byte]]]

val v_a: T_A[CC_A[CC_A[Char]], T_A[Byte, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}