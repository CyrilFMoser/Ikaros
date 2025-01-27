package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Byte, E]
case class CC_B(a: T_A[CC_A[(Boolean,Int)], T_A[Boolean, Int]], b: T_A[Byte, T_A[Int, Boolean]], c: CC_A[T_A[Byte, Byte]]) extends T_A[Byte, CC_A[T_A[Int, Char]]]
case class CC_C[F](a: T_A[F, F], b: F) extends T_A[Byte, F]
case class CC_D[G](a: G) extends T_B[G, CC_B]
case class CC_E[H](a: T_A[Byte, H], b: CC_B, c: T_B[H, H]) extends T_B[T_A[Byte, T_B[(Int,Boolean), CC_B]], CC_B]
case class CC_F() extends T_B[CC_B, CC_B]

val v_a: T_B[T_A[Byte, T_B[(Int,Boolean), CC_B]], CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
  case CC_D(CC_C(_, CC_D(_))) => 1 
  case CC_E(_, _, _) => 2 
}
}