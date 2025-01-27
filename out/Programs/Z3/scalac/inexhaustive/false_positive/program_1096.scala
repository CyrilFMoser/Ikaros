package Program_31 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[Boolean], c: (CC_A,Boolean)) extends T_A
case class CC_C[B](a: CC_B, b: T_B[B]) extends T_B[B]
case class CC_D[C, D]() extends T_B[C]
case class CC_E(a: T_B[CC_B], b: T_B[CC_A]) extends T_B[T_B[CC_A]]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(CC_B(_, _, _), CC_D()) => 1 
  case CC_C(CC_B(_, _, _), _) => 2 
  case CC_C(CC_B(_, _, _), CC_C(_, _)) => 3 
}
}
// This is not matched: (CC_D Boolean T_A (T_B Boolean))
// This is not matched: (CC_D Wildcard (CC_E T_B) Wildcard T_B)