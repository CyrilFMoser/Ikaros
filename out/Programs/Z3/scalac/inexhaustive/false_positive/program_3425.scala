package Program_15 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B[C, D](a: CC_A, b: T_B[T_A, C]) extends T_B[T_A, C]
case class CC_C[E](a: T_B[E, E], b: (CC_A,T_A)) extends T_B[T_A, E]
case class CC_D[F](a: CC_A, b: T_B[T_A, F], c: (T_A,CC_A)) extends T_B[T_A, F]

val v_a: T_B[T_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, (CC_A(_),CC_A(_))) => 0 
  case CC_B(CC_A(_), CC_D(_, _, _)) => 1 
  case CC_B(CC_A(_), CC_B(_, _)) => 2 
  case CC_B(CC_A(_), CC_C(_, _)) => 3 
  case CC_B(_, CC_C(_, _)) => 4 
  case CC_B(_, CC_D(_, _, _)) => 5 
  case CC_D(CC_A(_), CC_B(_, _), _) => 6 
  case CC_D(CC_A(_), CC_B(_, _), (CC_A(_),CC_A(_))) => 7 
  case CC_D(_, _, _) => 8 
  case CC_D(_, CC_D(_, _, _), _) => 9 
}
}
// This is not matched: (CC_B (CC_A (CC_A T_A T_A) (CC_A T_A T_A))
//      (CC_A T_A T_A)
//      Wildcard
//      Wildcard
//      (T_B T_A (CC_A (CC_A T_A T_A) (CC_A T_A T_A))))
// This is not matched: (CC_B (Tuple (CC_A (CC_A (CC_A Wildcard Wildcard (Tuple Wildcard Wildcard) T_A)
//                         Boolean
//                         Wildcard
//                         T_A)
//                   Wildcard
//                   Wildcard
//                   T_A)
//             (CC_A (CC_A Wildcard
//                         Boolean
//                         (Tuple (CC_B Wildcard Wildcard Byte T_A)
//                                (CC_B (Tuple Wildcard Wildcard)
//                                      Wildcard
//                                      Byte
//                                      T_A))
//                         T_A)
//                   Wildcard
//                   Wildcard
//                   T_A))
//      Wildcard
//      Wildcard
//      T_A)