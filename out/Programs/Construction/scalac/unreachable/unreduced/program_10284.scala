package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: E, c: Char) extends T_A[E, T_A[(Int,Byte), T_B[Boolean, Char]]]
case class CC_B[F](a: T_A[F, F]) extends T_A[F, T_A[(Int,Byte), T_B[Boolean, Char]]]
case class CC_C[G, H](a: CC_A[H], b: T_B[H, H], c: T_B[H, T_B[H, Char]]) extends T_A[G, T_A[(Int,Byte), T_B[Boolean, Char]]]

val v_a: T_A[Char, T_A[(Int,Byte), T_B[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, _, _)