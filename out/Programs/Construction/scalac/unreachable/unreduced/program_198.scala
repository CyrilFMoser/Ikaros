package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G](a: T_A[G, G], b: T_B[T_A[G, G], G]) extends T_A[CC_A[G, G], G]
case class CC_C[H](a: CC_A[H, H], b: Boolean) extends T_A[CC_A[T_B[T_B[Char, Boolean], T_A[Byte, Int]], T_B[T_B[Char, Boolean], T_A[Byte, Int]]], T_B[T_B[Char, Boolean], T_A[Byte, Int]]]
case class CC_D[I](a: Boolean, b: Boolean) extends T_B[CC_A[I, I], I]
case class CC_E[J](a: (T_A[Boolean, Boolean],CC_C[(Boolean,Char)]), b: CC_D[J], c: (CC_D[Byte],(Byte,Int))) extends T_B[CC_A[J, J], J]
case class CC_F[K](a: (CC_A[Int, Boolean],CC_A[Byte, Char]), b: Char) extends T_B[CC_A[K, K], K]

val v_a: T_A[CC_A[T_B[T_B[Char, Boolean], T_A[Byte, Int]], T_B[T_B[Char, Boolean], T_A[Byte, Int]]], T_B[T_B[Char, Boolean], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _)