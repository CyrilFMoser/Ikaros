package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_B[F, F], c: F) extends T_A[F]
case class CC_D[G](a: G) extends T_B[G, T_B[G, G]]
case class CC_E[H](a: T_A[(Byte,Boolean)], b: T_A[Boolean]) extends T_B[H, (Int,T_B[Boolean, Boolean])]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_), _) => 1 
  case CC_A(_, CC_C(_, _, _), _) => 2 
  case CC_B(CC_A(_, _, _)) => 3 
  case CC_B(CC_B(_)) => 4 
  case CC_B(CC_C(_, _, _)) => 5 
  case CC_C(_, _, _) => 6 
}
}