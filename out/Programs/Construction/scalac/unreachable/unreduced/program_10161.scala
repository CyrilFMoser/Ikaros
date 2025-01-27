package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, E], b: Char, c: T_A[E, E]) extends T_A[F, E]
case class CC_B[G](a: T_B[T_A[G, G], G], b: T_B[CC_A[G, G], G], c: G) extends T_B[CC_A[G, G], G]
case class CC_C[H](a: H, b: T_B[CC_A[H, H], H], c: H) extends T_B[CC_A[H, H], H]
case class CC_D(a: (CC_B[Int],CC_C[Char]), b: Boolean) extends T_B[CC_A[(CC_B[Char],T_A[Byte, (Char,Byte)]), (CC_B[Char],T_A[Byte, (Char,Byte)])], (CC_B[Char],T_A[Byte, (Char,Byte)])]

val v_a: T_B[CC_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_C(_, _, _), _), _) => 0 
  case CC_B(_, CC_C(_, _, _), _) => 1 
  case CC_C(_, _, _) => 2 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_B(_, _, _), _), _)