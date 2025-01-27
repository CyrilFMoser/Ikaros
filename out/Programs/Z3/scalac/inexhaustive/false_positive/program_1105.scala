package Program_31 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Byte]) extends T_A[Int]
case class CC_B(a: CC_A, b: T_A[Int]) extends T_A[Int]
case class CC_C() extends T_A[Int]
case class CC_D[E, D](a: CC_C, b: Char) extends T_B[E, D]
case class CC_E[F, G, H](a: T_B[H, H]) extends T_B[F, G]
case class CC_F[J, I](a: I, b: T_A[J]) extends T_B[I, J]

val v_a: T_B[CC_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(), _) => 0 
  case CC_D(_, 'x') => 1 
  case CC_D(_, _) => 2 
  case CC_E(CC_F(_, _)) => 3 
  case CC_E(_) => 4 
  case CC_F(CC_B(_, _), _) => 5 
}
}
// This is not matched: (CC_E (CC_B Boolean Boolean Boolean)
//      (CC_B Boolean Boolean Boolean)
//      Boolean
//      Wildcard
//      (T_B (CC_B Boolean Boolean Boolean) (CC_B Boolean Boolean Boolean)))
// This is not matched: (CC_A (CC_F Boolean Boolean Boolean) (T_A (CC_F Boolean Boolean Boolean)))