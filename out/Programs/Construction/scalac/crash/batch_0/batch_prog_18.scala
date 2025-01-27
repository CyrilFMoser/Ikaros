package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[G, H]() extends T_A[H, G]
case class CC_C[I, J](a: I, b: J) extends T_A[I, J]
case class CC_D(a: T_A[CC_C[Int, Byte], T_A[Byte, Int]]) extends T_B[T_A[Byte, T_A[Int, Byte]], Byte]
case class CC_E(a: CC_D, b: (T_A[CC_D, CC_D],T_A[Char, CC_D]), c: T_A[T_A[CC_D, (Char,Int)], Char]) extends T_B[T_A[Byte, T_A[Int, Byte]], Byte]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
  case CC_D(CC_B()) => 1 
  case CC_D(CC_C(_, _)) => 2 
}
}