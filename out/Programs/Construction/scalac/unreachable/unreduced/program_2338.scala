package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_A[Char, Byte], T_A[Int, Byte]]) extends T_A[(T_A[Boolean, (Char,Int)],T_A[Byte, Boolean]), T_B[(Int,Int), T_B[Char, Int]]]
case class CC_B() extends T_A[(T_A[Boolean, (Char,Int)],T_A[Byte, Boolean]), T_B[(Int,Int), T_B[Char, Int]]]

val v_a: T_A[(T_A[Boolean, (Char,Int)],T_A[Byte, Boolean]), T_B[(Int,Int), T_B[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}