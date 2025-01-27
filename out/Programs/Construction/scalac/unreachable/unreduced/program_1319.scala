package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Char]]) extends T_A[(T_A[Boolean],T_B[Byte])]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A]]) extends T_A[(T_A[Boolean],T_B[Byte])]

val v_a: T_A[(T_A[Boolean],T_B[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}