package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Char], T_A[Char, Int]]) extends T_A[(T_A[Int, Int],T_B[Char]), T_A[Byte, T_B[Char]]]
case class CC_B() extends T_A[(T_A[Int, Int],T_B[Char]), T_A[Byte, T_B[Char]]]
case class CC_C(a: CC_A) extends T_A[CC_A, CC_A]

val v_a: T_A[(T_A[Int, Int],T_B[Char]), T_A[Byte, T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}