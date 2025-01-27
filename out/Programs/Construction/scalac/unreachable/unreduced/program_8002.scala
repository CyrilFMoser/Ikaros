package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[Byte, C], C]
case class CC_B[D](a: T_A[T_A[Byte, D], D]) extends T_A[T_A[Byte, D], D]
case class CC_C() extends T_A[T_A[Byte, T_A[T_A[Byte, CC_A[Char]], CC_A[Char]]], T_A[T_A[Byte, CC_A[Char]], CC_A[Char]]]

val v_a: T_A[T_A[Byte, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(CC_A(_))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
}
}