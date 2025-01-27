package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_B[Boolean, Int], (Int,Byte)], E]
case class CC_B[F, G](a: T_B[G, G], b: F, c: CC_A[F]) extends T_A[T_B[T_B[Boolean, Int], (Int,Byte)], F]
case class CC_C[H](a: T_A[H, H], b: T_B[H, Boolean]) extends T_A[T_B[T_B[Boolean, Int], (Int,Byte)], H]

val v_a: T_A[T_B[T_B[Boolean, Int], (Int,Byte)], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_C(_, _) => 2 
}
}