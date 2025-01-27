package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean, b: Boolean) extends T_A[T_B[T_B[Byte, Int], T_B[(Byte,Boolean), Byte]]]
case class CC_B(a: T_B[T_A[(Char,Byte)], T_A[CC_A]]) extends T_A[T_B[T_B[Byte, Int], T_B[(Byte,Boolean), Byte]]]
case class CC_C[D]() extends T_B[D, (Int,T_A[CC_B])]
case class CC_D[E]() extends T_B[E, (Int,T_A[CC_B])]

val v_a: T_A[T_B[T_B[Byte, Int], T_B[(Byte,Boolean), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_B(_) => 2 
}
}