package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B[H, G](a: G, b: T_B[G, H], c: G) extends T_A[H, G]
case class CC_C[J, I](a: CC_B[I, I], b: Boolean) extends T_A[I, J]
case class CC_D(a: Int) extends T_B[T_A[T_A[Int, Byte], T_A[Char, Int]], CC_C[T_A[Char, Byte], T_A[Int, Int]]]
case class CC_E(a: Char, b: T_A[T_A[CC_D, CC_D], T_A[CC_D, Boolean]]) extends T_B[T_A[T_A[Int, Byte], T_A[Char, Int]], CC_C[T_A[Char, Byte], T_A[Int, Int]]]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(CC_B(_, _, _), _)