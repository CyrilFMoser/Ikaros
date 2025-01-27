package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, Byte], T_A[(Char,Int), Byte]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Boolean, Byte], T_A[(Char,Int), Byte]]]
case class CC_C[E](a: (CC_A[Int],CC_A[Int]), b: E) extends T_A[E, CC_B[Int]]

val v_a: T_A[Int, T_A[T_A[Boolean, Byte], T_A[(Char,Int), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}