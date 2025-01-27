package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: CC_A[E]) extends T_A[E, T_A[E, E]]
case class CC_C[F, G](a: G, b: T_B[F], c: Int) extends T_A[F, T_A[F, F]]
case class CC_D(a: T_A[CC_C[Int, Boolean], T_A[CC_C[Int, Boolean], CC_C[Int, Boolean]]], b: T_A[T_B[Int], T_A[T_B[Int], T_B[Int]]], c: CC_C[(Int,(Boolean,Byte)), T_A[Char, Int]]) extends T_B[(Int,CC_B[Int])]
case class CC_E(a: T_A[Boolean, CC_B[CC_D]]) extends T_B[(Int,CC_B[Int])]
case class CC_F[H](a: CC_E, b: T_A[H, H], c: T_A[H, T_A[H, H]]) extends T_B[H]

val v_a: T_B[(Int,CC_B[Int])] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_F(CC_E(_), _, CC_A((_,_), _)) => 1 
  case CC_F(CC_E(_), _, CC_B(CC_A(_, _))) => 2 
  case CC_F(CC_E(_), _, CC_C(_, _, _)) => 3 
}
}
// This is not matched: CC_E(_)