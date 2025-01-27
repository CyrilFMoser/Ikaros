package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Byte, Char]], b: Boolean, c: T_B[T_A[(Char,Char)], T_A[Boolean]]) extends T_A[T_B[T_B[Byte, Byte], T_A[Char]]]
case class CC_B(a: (CC_A,Boolean)) extends T_A[T_B[T_B[Byte, Byte], T_A[Char]]]
case class CC_C[D](a: D) extends T_B[CC_B, D]

val v_a: T_A[T_B[T_B[Byte, Byte], T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}