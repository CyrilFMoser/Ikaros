package Program_12 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[T_A, T_A]) extends T_A
case class CC_B(a: Char, b: T_A, c: T_B[CC_A, T_A]) extends T_A
case class CC_C(a: Char, b: CC_A) extends T_A
case class CC_D[C, D, E](a: D, b: C, c: CC_B) extends T_B[C, D]
case class CC_E[F, G](a: T_B[F, G]) extends T_B[F, G]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_D(_, CC_A(_, _), _) => 1 
  case CC_D(_, CC_A(_, _), CC_B(_, _, _)) => 2 
  case CC_D(CC_A(_, _), CC_A(_, _), _) => 3 
  case CC_E(CC_E(_)) => 4 
  case CC_E(CC_D(_, _, _)) => 5 
}
}
// This is not matched: (CC_D (CC_A (T_B T_A T_A) (T_B T_A T_A) (T_B T_A T_A))
//      (CC_A (T_B T_A T_A) (T_B T_A T_A) (T_B T_A T_A))
//      T_A
//      Wildcard
//      Wildcard
//      (CC_B Char Wildcard Wildcard T_A)
//      (T_B (CC_A (T_B T_A T_A) (T_B T_A T_A) (T_B T_A T_A))
//           (CC_A (T_B T_A T_A) (T_B T_A T_A) (T_B T_A T_A))))
// This is not matched: (CC_A Wildcard
//      (Tuple (CC_B Wildcard Wildcard (CC_A Int Wildcard Wildcard T_A) T_A) Int)
//      Wildcard
//      T_A)