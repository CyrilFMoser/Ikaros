package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[T_B[Int, Char], (Byte,Int)], Char]
case class CC_B(a: CC_A, b: T_B[(Int,CC_A), T_B[(Char,Int), CC_A]], c: (Boolean,CC_A)) extends T_A[T_A[T_B[Int, Char], (Byte,Int)], Char]
case class CC_C() extends T_A[T_A[T_B[Int, Char], (Byte,Int)], Char]
case class CC_D[E, F](a: T_B[F, E], b: F, c: (T_A[CC_B, CC_C],CC_B)) extends T_B[F, E]
case class CC_E[G, H, I](a: Char, b: I, c: (CC_D[CC_B, CC_A],CC_C)) extends T_B[H, G]
case class CC_F[K, J](a: CC_B, b: Byte, c: T_A[J, J]) extends T_B[K, J]

val v_a: T_B[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _, _), _, (_,CC_B(_, _, _))) => 0 
  case CC_D(CC_E(_, _, _), _, (_,CC_B(_, _, _))) => 1 
  case CC_D(CC_F(CC_B(_, _, _), _, _), _, (_,CC_B(_, _, _))) => 2 
  case CC_E(_, _, _) => 3 
  case CC_F(_, _, _) => 4 
}
}