package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: (T_B[Byte, Int],T_A[Int]), c: CC_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_A[F]
case class CC_D[G](a: (Boolean,(Boolean,Byte)), b: T_B[G, G], c: T_B[G, G]) extends T_B[T_A[Char], G]
case class CC_E[H]() extends T_B[H, T_A[H]]
case class CC_F[I](a: Char) extends T_B[I, T_A[I]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C(CC_A(_))) => 4 
  case CC_A(CC_C(CC_C(_))) => 5 
  case CC_B(_, _, _) => 6 
  case CC_C(CC_A(CC_A(_))) => 7 
  case CC_C(CC_A(CC_B(_, _, _))) => 8 
  case CC_C(CC_A(CC_C(_))) => 9 
  case CC_C(CC_B(CC_A(_), (_,_), CC_A(_))) => 10 
  case CC_C(CC_C(CC_A(_))) => 11 
  case CC_C(CC_C(CC_B(_, _, _))) => 12 
  case CC_C(CC_C(CC_C(_))) => 13 
}
}
// This is not matched: CC_A(CC_C(CC_B(_, _, _)))