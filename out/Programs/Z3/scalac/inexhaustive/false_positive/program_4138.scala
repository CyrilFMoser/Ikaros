package Program_13 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D, E]() extends T_A[D, C]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C[H](a: (T_B,Byte)) extends T_A[CC_B[T_B, T_B], H]
case class CC_D(a: T_A[T_B, Int], b: T_B, c: CC_B[T_B, T_B]) extends T_B
case class CC_E(a: CC_C[(Int,Boolean)], b: T_A[Byte, CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_C(_), CC_B()) => 0 
  case CC_E(_, CC_A()) => 1 
  case CC_D(CC_A(), CC_E(_, _), _) => 2 
  case CC_D(_, _, _) => 3 
  case CC_D(_, _, CC_B()) => 4 
  case CC_D(_, CC_E(_, _), CC_B()) => 5 
  case CC_D(CC_B(), _, _) => 6 
  case CC_D(CC_B(), CC_D(_, _, _), CC_B()) => 7 
}
}
// This is not matched: (CC_E Wildcard
//      (CC_A (CC_D Wildcard Wildcard Wildcard Wildcard)
//            Byte
//            T_B
//            (T_A Byte (CC_D Wildcard Wildcard Wildcard Wildcard)))
//      T_B)
// This is not matched: (CC_C Wildcard
//      (CC_A T_A Wildcard (CC_B T_A) T_A)
//      (CC_A T_A
//            (CC_C Wildcard
//                  (CC_C Wildcard (CC_B T_A) (CC_B T_A) T_A)
//                  Wildcard
//                  T_A)
//            (CC_B T_A)
//            T_A)
//      T_A)