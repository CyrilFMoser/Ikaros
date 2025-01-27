package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: Char, b: T_B[E, E], c: F) extends T_A[F, E]
case class CC_B[G](a: G) extends T_A[G, T_A[CC_A[Boolean, Char], T_A[Boolean, (Int,Int)]]]
case class CC_C[H](a: CC_B[H]) extends T_B[H, T_B[H, H]]

val v_a: T_A[Boolean, T_A[CC_A[Boolean, Char], T_A[Boolean, (Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A('x', _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_) => 2 
}
}