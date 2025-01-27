package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: (T_A[Int, Char],T_B[Boolean, Int]), b: T_A[T_A[Boolean, Int], T_B[Boolean, Int]], c: T_A[T_A[(Boolean,Int), Byte], T_A[Int, Byte]]) extends T_A[(T_A[Int, Int],Int), T_B[T_A[Byte, Char], T_B[Byte, Char]]]
case class CC_B() extends T_A[(T_A[Int, Int],Int), T_B[T_A[Byte, Char], T_B[Byte, Char]]]

val v_a: T_A[(T_A[Int, Int],Int), T_B[T_A[Byte, Char], T_B[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}