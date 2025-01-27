package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Byte, Boolean]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_B[T_B[CC_A, Boolean], T_B[CC_A, CC_A]], b: T_B[CC_A, Char]) extends T_A[T_A[T_A[Char]]]
case class CC_C[D, E]() extends T_B[D, E]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}