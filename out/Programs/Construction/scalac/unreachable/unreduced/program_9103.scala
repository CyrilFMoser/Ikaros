package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[(Byte,Char), (Byte,(Char,Char))]]
case class CC_B[F, G](a: CC_A[Boolean], b: Int) extends T_A[F, T_A[(Byte,Char), (Byte,(Char,Char))]]
case class CC_C[H](a: CC_B[H, H]) extends T_B[CC_A[H], H]
case class CC_D[I, J](a: T_A[I, I], b: J) extends T_B[J, I]
case class CC_E[K](a: T_B[CC_A[K], K]) extends T_B[CC_A[K], K]

val v_a: CC_E[Int] = null
val v_b: Int = v_a match{
  case CC_E(CC_C(_)) => 0 
  case CC_E(CC_D(_, CC_A())) => 1 
  case CC_E(CC_E(CC_C(_))) => 2 
  case CC_E(CC_E(CC_D(_, _))) => 3 
  case CC_E(CC_E(CC_E(_))) => 4 
}
}