package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, F]) extends T_A[E, F]
case class CC_B[G](a: G, b: T_B[G, G], c: T_A[G, G]) extends T_A[(T_A[Byte, Boolean],T_A[(Int,Byte), Char]), G]
case class CC_C(a: CC_A[Char, T_A[Boolean, Byte]]) extends T_A[(T_A[Byte, Boolean],T_A[(Int,Byte), Char]), T_A[T_B[Char, Byte], CC_A[Boolean, Char]]]
case class CC_D[H]() extends T_B[Char, H]

val v_a: T_A[(T_A[Byte, Boolean],T_A[(Int,Byte), Char]), Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(12, _, CC_A(_)) => 1 
}
}
// This is not matched: CC_B(_, _, CC_A(_))