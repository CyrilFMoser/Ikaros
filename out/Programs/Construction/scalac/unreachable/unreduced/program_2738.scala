package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_B(a: T_B[T_A[Int], CC_A[Char]]) extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_C(a: ((CC_B,CC_B),CC_A[Byte]), b: CC_B, c: CC_A[Char]) extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_D[F, E](a: Char, b: (CC_B,Boolean)) extends T_B[F, E]
case class CC_E[G, H](a: H, b: T_A[G]) extends T_B[H, G]
case class CC_F[I](a: (CC_A[CC_B],(CC_C,CC_C))) extends T_B[T_B[CC_D[(Char,Boolean), CC_B], T_B[CC_B, CC_C]], I]

val v_a: T_B[CC_B, Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_B(CC_E(_, _)), _) => 1 
}
}
// This is not matched: CC_E(CC_B(CC_D(_, _)), _)