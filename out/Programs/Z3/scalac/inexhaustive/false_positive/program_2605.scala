package Program_31 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, CC_A], b: T_B[CC_A, CC_A]) extends T_A
case class CC_C[C](a: Int) extends T_A
case class CC_D[E, D]() extends T_B[E, D]
case class CC_E[G, F](a: F, b: (CC_B,CC_A)) extends T_B[F, G]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
  case CC_B(CC_E(_, _), CC_D()) => 2 
  case CC_B(_, _) => 3 
  case CC_B(CC_E(_, _), _) => 4 
}
}
// This is not matched: (CC_C T_A Wildcard T_A)
// This is not matched: (CC_C T_A Wildcard T_A)