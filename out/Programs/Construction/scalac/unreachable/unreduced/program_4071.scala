package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Byte) extends T_A[F, E]
case class CC_B[G](a: T_A[G, G], b: T_B[G, G], c: T_A[G, G]) extends T_A[(T_A[Byte, Byte],Boolean), G]
case class CC_C[H]() extends T_A[(T_A[Byte, Byte],Boolean), H]
case class CC_D[I]() extends T_B[I, T_B[T_B[Boolean, Int], Char]]
case class CC_E() extends T_B[T_A[T_A[Int, Int], T_A[Int, Int]], T_B[T_B[Boolean, Int], Char]]
case class CC_F(a: Byte, b: CC_C[CC_E]) extends T_B[T_A[T_A[Int, Int], T_A[Int, Int]], T_B[T_B[Boolean, Int], Char]]

val v_a: T_A[(T_A[Byte, Byte],Boolean), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}