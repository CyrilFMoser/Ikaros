package Program_15 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: Char) extends T_A[C, T_B]
case class CC_B[D, E](a: T_B, b: T_A[E, T_B], c: D) extends T_A[D, T_B]
case class CC_C() extends T_A[CC_A[T_B], T_B]
case class CC_D() extends T_B
case class CC_E(a: T_A[CC_D, CC_C], b: T_B) extends T_B
case class CC_F(a: CC_B[CC_C, CC_E]) extends T_B

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _, _), _) => 1 
  case CC_A(CC_B(_, _, _), 'x') => 2 
  case CC_B(_, CC_B(_, _, _), _) => 3 
  case CC_B(CC_E(_, _), CC_A(_, _), _) => 4 
  case CC_B(CC_F(_), _, _) => 5 
  case CC_B(CC_F(_), CC_C(), 0) => 6 
  case CC_B(CC_D(), CC_A(_, _), 0) => 7 
  case CC_B(CC_D(), CC_A(_, _), _) => 8 
  case CC_B(CC_D(), _, _) => 9 
  case CC_B(_, _, _) => 10 
  case CC_B(CC_E(_, _), CC_B(_, _, _), _) => 11 
  case CC_B(CC_F(_), CC_A(_, _), _) => 12 
  case CC_B(_, CC_A(_, _), 0) => 13 
  case CC_B(CC_D(), CC_B(_, _, _), _) => 14 
}
}
// This is not matched: (CC_B Byte
//      (CC_E T_B T_B T_B)
//      Wildcard
//      (CC_A (CC_E (T_A T_B T_B) T_B T_B)
//            (CC_A (CC_E (T_A T_B T_B) T_B T_B)
//                  Wildcard
//                  Wildcard
//                  (T_A (CC_E (T_A T_B T_B) T_B T_B) T_B))
//            Wildcard
//            (T_A (CC_E (T_A T_B T_B) T_B T_B) T_B))
//      Wildcard
//      (T_A Byte T_B))
// This is not matched: (CC_B Byte
//      (CC_E T_B T_B T_B)
//      Wildcard
//      (CC_A (CC_E (T_A T_B T_B) T_B T_B)
//            (CC_A (CC_E (T_A T_B T_B) T_B T_B)
//                  Wildcard
//                  Wildcard
//                  (T_A (CC_E (T_A T_B T_B) T_B T_B) T_B))
//            Wildcard
//            (T_A (CC_E (T_A T_B T_B) T_B T_B) T_B))
//      Wildcard
//      (T_A Byte T_B))