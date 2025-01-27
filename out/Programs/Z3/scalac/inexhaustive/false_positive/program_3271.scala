package Program_15 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A, c: CC_A) extends T_A
case class CC_C[C, D](a: T_A, b: T_A) extends T_B[T_B[C, C], C]
case class CC_D[E](a: Boolean, b: CC_C[E, E], c: Char) extends T_B[E, CC_A]
case class CC_E[G, F](a: (T_A,CC_A), b: T_B[G, CC_A]) extends T_B[F, G]

val v_a: T_B[T_B[CC_B, CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), CC_B(_, _, _)) => 0 
  case CC_C(_, _) => 1 
  case CC_C(CC_A(), CC_B(_, _, _)) => 2 
  case CC_E(_, _) => 3 
}
}
// This is not matched: (CC_C (CC_B T_A T_A T_A (T_B T_A T_A))
//      T_A
//      Wildcard
//      (CC_A T_A)
//      (T_B (T_B (CC_B T_A T_A T_A (T_B T_A T_A))
//                (CC_B T_A T_A T_A (T_B T_A T_A)))
//           (CC_B T_A T_A T_A (T_B T_A T_A))))
// This is not matched: (CC_C (CC_B T_A T_A T_A T_A)
//      T_A
//      Wildcard
//      (CC_A T_A)
//      (T_B (T_B (CC_B T_A T_A T_A T_A) (CC_B T_A T_A T_A T_A))
//           (CC_B T_A T_A T_A T_A)))