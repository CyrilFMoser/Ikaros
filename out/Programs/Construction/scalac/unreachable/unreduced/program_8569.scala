package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[T_B[Int, Byte], E]
case class CC_B[F](a: F) extends T_A[T_B[Int, Byte], F]
case class CC_C(a: CC_B[T_B[Char, Boolean]]) extends T_A[T_B[Int, Byte], T_B[(Int,Char), T_A[Int, Char]]]
case class CC_D[H, G]() extends T_B[G, H]

val v_a: T_A[T_B[Int, Byte], T_B[(Int,Char), T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(CC_D())