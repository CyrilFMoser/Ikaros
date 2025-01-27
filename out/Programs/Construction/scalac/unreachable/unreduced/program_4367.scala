package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Int],T_B[Byte, Char]), b: T_B[T_B[Int, Byte], (Byte,Byte)]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Int, b: T_A[T_B[CC_A, Byte]]) extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)