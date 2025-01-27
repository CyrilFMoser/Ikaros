package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[Char, Boolean],T_A[Char]), b: T_B[D, D], c: T_B[D, T_A[D]]) extends T_A[T_B[T_A[Char], T_B[Char, Int]]]
case class CC_B() extends T_A[(T_A[Int],T_B[Byte, Byte])]
case class CC_C(a: T_B[CC_B, T_A[CC_B]], b: CC_A[Byte], c: T_A[CC_B]) extends T_A[(T_A[Int],T_B[Byte, Byte])]
case class CC_D[E](a: T_A[T_A[E]], b: T_A[E], c: T_A[E]) extends T_B[Char, E]
case class CC_E[G, F](a: F) extends T_B[F, G]
case class CC_F(a: CC_E[CC_E[CC_C, CC_C], CC_B], b: T_B[T_A[CC_B], CC_A[CC_C]]) extends T_B[Char, T_B[Char, (CC_B,CC_C)]]

val v_a: T_B[Char, T_B[Char, (CC_B,CC_C)]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_F(CC_E(_), CC_E(_))