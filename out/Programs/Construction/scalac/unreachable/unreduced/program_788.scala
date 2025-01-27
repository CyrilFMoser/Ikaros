package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, Byte], T_A[(Boolean,Byte), Byte]]]
case class CC_B[D](a: D, b: T_A[Byte, D], c: T_A[D, D]) extends T_A[D, T_A[T_A[Byte, Byte], T_A[(Boolean,Byte), Byte]]]
case class CC_C[E]() extends T_A[E, T_A[T_A[Byte, Byte], T_A[(Boolean,Byte), Byte]]]

val v_a: T_A[Int, T_A[T_A[Byte, Byte], T_A[(Boolean,Byte), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}