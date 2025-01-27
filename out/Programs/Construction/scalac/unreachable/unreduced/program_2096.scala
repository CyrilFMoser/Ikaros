package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[Byte, C]
case class CC_B[D](a: Byte) extends T_A[Byte, T_A[Byte, T_A[Int, Char]]]
case class CC_C() extends T_A[Byte, CC_A[CC_A[Byte]]]

val v_a: T_A[Byte, CC_A[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}