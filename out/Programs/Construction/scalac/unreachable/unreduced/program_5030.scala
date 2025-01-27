package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Boolean) extends T_A[T_A[T_B[Byte, Boolean], Byte], E]
case class CC_B[F](a: (T_B[Boolean, Int],Int), b: CC_A[F]) extends T_A[F, CC_A[F]]
case class CC_C[G](a: (Byte,T_A[Char, Boolean])) extends T_B[G, Int]
case class CC_D[H, I](a: CC_A[H], b: CC_C[H], c: T_A[H, H]) extends T_B[H, I]
case class CC_E[J, K](a: T_A[K, CC_A[K]]) extends T_B[J, K]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B((CC_C(_),_), _) => 0 
  case CC_B((CC_D(_, _, _),_), _) => 1 
  case CC_B((CC_E(_),_), _) => 2 
}
}