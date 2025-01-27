package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean) extends T_A[E, T_A[E, E]]
case class CC_B() extends T_A[Int, T_A[Int, Int]]
case class CC_C[F](a: T_A[Int, T_A[Int, Int]], b: CC_A[F], c: Char) extends T_B[F, CC_B]
case class CC_D[G](a: T_B[G, CC_B], b: G) extends T_B[G, CC_B]
case class CC_E[H](a: T_A[Int, T_A[Int, Int]], b: T_B[H, H]) extends T_B[H, CC_B]

val v_a: T_B[Boolean, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_), _) => 0 
  case CC_D(_, _) => 1 
  case CC_E(CC_A(_), _) => 2 
  case CC_E(CC_B(), _) => 3 
}
}