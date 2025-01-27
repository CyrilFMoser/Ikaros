package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B[H, G](a: Byte, b: T_B[H, G], c: T_A[G, G]) extends T_A[G, H]
case class CC_C[I, J](a: CC_B[J, J]) extends T_A[I, J]
case class CC_D[K](a: K, b: CC_C[K, K]) extends T_B[K, T_A[CC_B[Boolean, Boolean], Boolean]]
case class CC_E(a: T_A[T_A[Byte, (Char,Char)], T_A[Char, Byte]], b: CC_B[Char, (Byte,Boolean)]) extends T_B[T_A[CC_A[Char, Int], T_B[Char, Boolean]], T_A[CC_B[Boolean, Boolean], Boolean]]

val v_a: T_A[CC_E, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A()