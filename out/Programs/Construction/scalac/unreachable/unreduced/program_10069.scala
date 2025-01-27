package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, F], b: T_B[E, T_A[Int, E]], c: T_B[E, F]) extends T_A[E, F]
case class CC_B[H, G](a: T_B[G, H]) extends T_A[H, G]
case class CC_C[J, I](a: T_A[I, I]) extends T_A[J, I]
case class CC_D(a: Char, b: Int) extends T_B[CC_C[T_A[Boolean, Boolean], Char], CC_C[(Int,Int), T_A[Int, Boolean]]]
case class CC_E(a: T_B[(Byte,CC_D), CC_D], b: Int, c: CC_C[CC_B[(Byte,Byte), CC_D], T_A[CC_D, CC_D]]) extends T_B[CC_C[T_A[Boolean, Boolean], Char], CC_C[(Int,Int), T_A[Int, Boolean]]]
case class CC_F[K](a: T_A[T_B[K, K], K], b: CC_B[K, K]) extends T_B[K, Char]

val v_a: T_A[Byte, CC_E] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(_, _, _)) => 2 
  case CC_C(CC_B(_)) => 3 
  case CC_C(CC_C(CC_B(_))) => 4 
  case CC_C(CC_C(CC_C(_))) => 5 
}
}
// This is not matched: CC_C(CC_C(CC_A(_, _, _)))