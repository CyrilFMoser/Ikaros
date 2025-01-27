package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, (Byte,Boolean)], b: Int, c: (T_A[Int],T_A[Boolean])) extends T_A[E]
case class CC_C[F](a: F, b: F) extends T_B[F, T_A[F]]
case class CC_D[G](a: G, b: CC_A[G]) extends T_B[G, T_A[G]]
case class CC_E[H](a: H, b: T_A[H]) extends T_B[H, T_A[H]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_B(_, _, (CC_A(_),CC_A(_))) => 2 
  case CC_B(_, _, (CC_A(_),CC_B(_, _, _))) => 3 
  case CC_B(_, _, (CC_B(_, _, _),CC_A(_))) => 4 
  case CC_B(_, _, (CC_B(_, _, _),CC_B(_, _, _))) => 5 
}
}
// This is not matched: CC_A(CC_B(_, _, (_,_)))