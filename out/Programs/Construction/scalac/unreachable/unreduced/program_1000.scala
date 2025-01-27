package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, E], b: E) extends T_A[E, F]
case class CC_B[G](a: Int, b: CC_A[G, G]) extends T_A[Char, T_A[T_B[Char, Int], (Boolean,Int)]]
case class CC_C(a: Byte, b: T_B[Byte, T_A[Byte, Boolean]]) extends T_A[Char, T_A[T_B[Char, Int], (Boolean,Int)]]
case class CC_D[H](a: CC_C, b: T_A[H, CC_C], c: T_A[H, H]) extends T_B[CC_A[H, H], H]

val v_a: T_A[Char, T_A[T_B[Char, Int], (Boolean,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}