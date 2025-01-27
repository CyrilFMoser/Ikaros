package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B(a: T_A[T_B[Char, Boolean], T_A[Byte, Byte]], b: Char, c: T_A[CC_A[Byte, Char], CC_A[Byte, Byte]]) extends T_A[(T_A[Byte, Int],T_A[Byte, Int]), CC_A[T_B[Boolean, Boolean], Boolean]]
case class CC_C() extends T_A[(T_A[Byte, Int],T_A[Byte, Int]), CC_A[T_B[Boolean, Boolean], Boolean]]
case class CC_D[G](a: T_B[G, Byte], b: CC_A[G, G]) extends T_B[T_B[G, G], G]
case class CC_E[H](a: H) extends T_B[T_B[H, H], H]
case class CC_F[I]() extends T_B[T_B[I, I], I]

val v_a: T_B[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A()) => 0 
  case CC_E(_) => 1 
  case CC_F() => 2 
}
}