package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, Char]) extends T_A[E, Char]
case class CC_B(a: T_A[T_A[Byte, Boolean], (Char,Byte)], b: CC_A[CC_A[Byte]]) extends T_B[(T_B[Byte, Int],(Int,Byte)), T_A[Byte, Char]]
case class CC_C(a: CC_A[(CC_B,CC_B)], b: T_A[T_B[CC_B, CC_B], Char], c: T_A[T_A[CC_B, CC_B], Char]) extends T_B[(T_B[Byte, Int],(Int,Byte)), T_A[Byte, Char]]

val v_a: T_B[(T_B[Byte, Int],(Int,Byte)), T_A[Byte, Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(CC_A(_))) => 0 
  case CC_C(_, _, _) => 1 
}
}