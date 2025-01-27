package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte, c: Byte) extends T_A[C, T_A[(Char,Byte), T_A[Int, Byte]]]
case class CC_B[D](a: D) extends T_A[D, T_A[(Char,Byte), T_A[Int, Byte]]]

val v_a: T_A[Byte, T_A[(Char,Byte), T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}