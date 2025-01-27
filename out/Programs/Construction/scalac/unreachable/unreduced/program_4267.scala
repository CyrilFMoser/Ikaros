package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E, b: E) extends T_A[F, E]
case class CC_B[G](a: T_B[G, G], b: T_A[G, G]) extends T_A[G, T_A[G, Int]]
case class CC_C[H](a: CC_A[H, H], b: H) extends T_A[H, T_A[H, H]]
case class CC_D[I](a: Byte, b: I) extends T_B[I, T_A[(Boolean,Int), T_A[(Boolean,Int), Int]]]
case class CC_E(a: (CC_A[Int, Char],CC_C[Char])) extends T_B[T_A[T_A[Byte, Int], T_B[Byte, Byte]], T_A[(Boolean,Int), T_A[(Boolean,Int), Int]]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_B(_, CC_A(_, 12)) => 1 
  case CC_B(_, CC_A(_, _)) => 2 
  case CC_C(CC_A(_, _), _) => 3 
}
}