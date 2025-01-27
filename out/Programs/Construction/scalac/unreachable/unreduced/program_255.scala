package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E, F](a: E, b: T_A[F], c: T_A[F]) extends T_A[E]
case class CC_C[G](a: CC_B[G, G], b: Int, c: Boolean) extends T_A[G]
case class CC_D[H](a: T_B[H, H], b: CC_B[H, H], c: T_A[T_A[H]]) extends T_B[H, CC_B[H, CC_C[H]]]
case class CC_E(a: CC_A[T_A[Boolean]], b: CC_B[CC_C[Char], T_A[Int]]) extends T_B[T_A[CC_A[Byte]], CC_B[T_A[CC_A[Byte]], CC_C[T_A[CC_A[Byte]]]]]

val v_a: T_B[T_A[CC_A[Byte]], CC_B[T_A[CC_A[Byte]], CC_C[T_A[CC_A[Byte]]]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_, _, _), CC_A()) => 0 
  case CC_D(_, CC_B(_, _, _), CC_B(_, _, _)) => 1 
  case CC_D(_, CC_B(_, _, _), CC_C(_, _, _)) => 2 
  case CC_E(_, _) => 3 
}
}