package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, E], b: E) extends T_A[E, F]
case class CC_B[H, G](a: G) extends T_A[H, G]
case class CC_C[I]() extends T_B[I, T_A[I, I]]
case class CC_D[J](a: T_A[Boolean, J], b: CC_B[J, J], c: CC_A[J, T_A[J, J]]) extends T_B[CC_A[T_A[(Char,Boolean), Byte], T_B[Byte, Int]], J]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_), _) => 1 
  case CC_B(12) => 2 
  case CC_B(_) => 3 
}
}