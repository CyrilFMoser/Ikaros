package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B(a: Boolean, b: T_A[T_A[Char]]) extends T_A[Char]
case class CC_C[E](a: E, b: E, c: T_A[E]) extends T_A[Char]
case class CC_D[F, G](a: T_A[Char]) extends T_B[F, G]
case class CC_E[I, H](a: CC_C[CC_D[H, H]]) extends T_B[I, H]
case class CC_F[J](a: CC_E[J, J], b: T_A[Char], c: CC_A[J]) extends T_B[J, CC_A[(Byte,(Boolean,Int))]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(true, CC_A(_))) => 3 
  case CC_A(CC_B(false, CC_A(_))) => 4 
  case CC_A(CC_C(_, _, _)) => 5 
  case CC_B(_, _) => 6 
  case CC_C(_, _, _) => 7 
}
}