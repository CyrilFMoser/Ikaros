package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, T_B[E, E]], E]
case class CC_B(a: (T_A[Char, Int],(Int,Byte)), b: CC_A[T_B[Boolean, Byte]], c: Boolean) extends T_A[T_B[CC_A[Char], T_B[CC_A[Char], CC_A[Char]]], CC_A[Char]]
case class CC_C[F]() extends T_B[F, T_A[F, Int]]
case class CC_D[H, G](a: Boolean, b: H, c: T_B[H, H]) extends T_B[G, H]
case class CC_E(a: T_A[(CC_B,CC_B), Char]) extends T_B[Char, T_A[Char, Int]]

val v_a: T_B[Char, T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, CC_D(_, _, CC_D(_, _, _))) => 1 
  case CC_E(_) => 2 
}
}