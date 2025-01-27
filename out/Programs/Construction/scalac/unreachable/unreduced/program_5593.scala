package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[Int], b: T_A[T_B[CC_A, CC_A]]) extends T_A[Int]
case class CC_C() extends T_A[Int]
case class CC_D[E, D, F](a: CC_A, b: CC_B, c: T_A[E]) extends T_B[D, E]
case class CC_E[G](a: T_A[Int], b: Int) extends T_B[Char, G]
case class CC_F[H, I](a: (T_B[CC_C, CC_C],CC_E[CC_B])) extends T_B[I, H]

val v_a: CC_E[Boolean] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(), _) => 0 
  case CC_E(CC_B(CC_A(), _), _) => 1 
  case CC_E(CC_B(CC_B(_, _), _), _) => 2 
  case CC_E(CC_B(CC_C(), _), _) => 3 
  case CC_E(CC_C(), _) => 4 
}
}