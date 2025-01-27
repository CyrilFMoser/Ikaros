package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C]) extends T_A[(T_A[Byte, Int],T_A[Boolean, Boolean]), C]
case class CC_B[D](a: CC_A[D], b: Byte) extends T_A[(T_A[Byte, Int],T_A[Boolean, Boolean]), D]

val v_a: T_A[(T_A[Byte, Int],T_A[Boolean, Boolean]), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}