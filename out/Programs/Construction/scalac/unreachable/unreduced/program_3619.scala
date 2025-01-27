package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[T_A[Int, Byte], T_A[(Char,Byte), Byte]]]
case class CC_B[D]() extends T_A[T_A[T_A[Int, Byte], CC_A[Int]], T_A[T_A[Int, Byte], T_A[(Char,Byte), Byte]]]

val v_a: T_A[T_A[T_A[Int, Byte], CC_A[Int]], T_A[T_A[Int, Byte], T_A[(Char,Byte), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}