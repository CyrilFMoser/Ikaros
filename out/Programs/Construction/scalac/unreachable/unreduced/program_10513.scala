package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, T_A[Byte, T_A[(Byte,Byte), Boolean]]]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: D) extends T_A[D, T_A[Byte, T_A[(Byte,Byte), Boolean]]]
case class CC_C[E]() extends T_A[E, T_A[Byte, T_A[(Byte,Byte), Boolean]]]

val v_a: T_A[Int, T_A[Byte, T_A[(Byte,Byte), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, _) => 1 
  case CC_C() => 2 
}
}