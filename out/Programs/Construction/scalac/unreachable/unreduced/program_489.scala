package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[D, E]
case class CC_B[F, G](a: F) extends T_A[G, F]
case class CC_C[H]() extends T_A[T_A[H, H], H]
case class CC_D(a: CC_A[T_A[Int, Byte], T_B[Boolean]]) extends T_B[CC_B[T_B[Byte], T_A[Char, Char]]]
case class CC_E(a: T_B[T_B[CC_D]]) extends T_B[CC_B[Char, Boolean]]

val v_a: T_A[Int, T_B[CC_B[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_E(_)) => 1 
}
}