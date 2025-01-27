package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_B[(Char,Byte), Int]]) extends T_A[T_A[T_B[Char, Boolean]]]
case class CC_B[E, D](a: D, b: ((CC_A,CC_A),T_A[CC_A])) extends T_B[D, E]
case class CC_C[F, G](a: T_B[F, F]) extends T_B[F, G]
case class CC_D[H]() extends T_B[T_A[CC_C[CC_A, CC_A]], H]

val v_a: T_A[T_A[T_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_B(_, _))) => 0 
  case CC_A(CC_C(CC_C(_))) => 1 
}
}
// This is not matched: CC_A(CC_B(_, _))