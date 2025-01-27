package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: E, c: Byte) extends T_A[E, T_A[T_A[Char, Byte], Char]]
case class CC_B(a: T_A[CC_A[Int], Int], b: T_B[T_A[Int, Char], CC_A[Char]], c: T_A[(Byte,Int), T_B[Int, Int]]) extends T_A[T_B[T_B[Boolean, (Char,Boolean)], CC_A[Boolean]], T_A[T_A[Char, Byte], Char]]
case class CC_C[F](a: Char) extends T_B[CC_B, F]
case class CC_D[G](a: T_B[G, G]) extends T_B[CC_B, G]
case class CC_E[H](a: CC_B) extends T_B[CC_B, H]

val v_a: T_B[CC_B, T_A[T_B[T_B[Boolean, (Char,Boolean)], CC_A[Boolean]], T_A[T_A[Char, Byte], Char]]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_C(_)