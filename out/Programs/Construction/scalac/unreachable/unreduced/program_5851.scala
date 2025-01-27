package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[H, G](a: H, b: CC_A[G, G]) extends T_A[G, H]
case class CC_C[I](a: T_B[I, I]) extends T_B[CC_A[I, I], I]
case class CC_D[J](a: T_A[Char, T_A[J, J]], b: (CC_C[Byte],CC_A[Int, Byte]), c: J) extends T_B[CC_A[J, J], J]
case class CC_E() extends T_B[CC_A[Boolean, Boolean], Boolean]

val v_a: T_B[CC_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_A(), _, _) => 1 
  case CC_D(CC_B(CC_A(), CC_A()), _, _) => 2 
  case CC_D(CC_B(CC_B(_, _), CC_A()), _, _) => 3 
}
}