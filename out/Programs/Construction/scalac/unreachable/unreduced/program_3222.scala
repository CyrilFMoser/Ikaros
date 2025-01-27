package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[T_A[(Boolean,Boolean), Byte], T_A[Int, (Byte,Char)]]]
case class CC_B[F](a: F, b: T_A[F, F], c: F) extends T_A[F, T_B[T_A[(Boolean,Boolean), Byte], T_A[Int, (Byte,Char)]]]
case class CC_C[H, G](a: CC_A[H], b: CC_A[G], c: T_A[G, T_B[Byte, H]]) extends T_B[H, G]
case class CC_D[I](a: T_A[I, I], b: (Byte,CC_C[(Char,Char), Int])) extends T_B[(T_B[Char, Byte],CC_C[Boolean, Int]), I]
case class CC_E[J, K](a: Boolean, b: Char, c: T_B[J, K]) extends T_B[J, K]

val v_a: T_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(), _) => 0 
  case CC_E(_, _, _) => 1 
}
}