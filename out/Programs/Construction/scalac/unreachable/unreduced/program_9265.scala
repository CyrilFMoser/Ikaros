package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_A[Int, Boolean], T_B[Char]]) extends T_A[(T_A[Byte, Int],T_A[Byte, Byte]), T_B[T_A[Byte, Int]]]
case class CC_B() extends T_A[(T_A[Byte, Int],T_A[Byte, Byte]), T_B[T_A[Byte, Int]]]

val v_a: T_A[(T_A[Byte, Int],T_A[Byte, Byte]), T_B[T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}