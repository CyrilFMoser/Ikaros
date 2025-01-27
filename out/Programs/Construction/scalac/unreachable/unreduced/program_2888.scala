package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_A[F], b: CC_A[F], c: (T_A[Byte],T_A[Boolean])) extends T_B[T_A[CC_A[(Int,Char)]], F]
case class CC_D[G]() extends T_B[T_A[CC_A[(Int,Char)]], G]
case class CC_E[H](a: T_B[H, T_B[H, H]], b: H, c: Byte) extends T_B[H, T_B[H, H]]

val v_a: T_B[T_A[CC_A[(Int,Char)]], Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), CC_A(_), (CC_A(_),CC_A(_))) => 0 
  case CC_C(CC_A(_), CC_A(_), (CC_A(_),CC_B())) => 1 
  case CC_C(CC_A(_), CC_A(_), (CC_B(),CC_A(_))) => 2 
  case CC_C(CC_A(_), CC_A(_), (CC_B(),CC_B())) => 3 
  case CC_C(CC_B(), CC_A(_), (CC_A(_),CC_B())) => 4 
  case CC_C(CC_B(), CC_A(_), (CC_B(),CC_A(_))) => 5 
  case CC_C(CC_B(), CC_A(_), (CC_B(),CC_B())) => 6 
  case CC_D() => 7 
}
}
// This is not matched: CC_C(CC_B(), CC_A(_), (CC_A(_),CC_A(_)))