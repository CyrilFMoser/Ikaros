package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[C], b: T_A[T_B]) extends T_A[B]

val v_a: CC_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 2 
}
}
// This is not matched: (CC_A Char
//      Byte
//      (CC_A Byte
//            T_B
//            (CC_A T_B
//                  T_B
//                  (CC_A T_B T_B Wildcard Wildcard (T_A T_B))
//                  Wildcard
//                  (T_A T_B))
//            (CC_A T_B
//                  T_B
//                  Wildcard
//                  (CC_A T_B T_B Wildcard Wildcard (T_A T_B))
//                  (T_A T_B))
//            (T_A Byte))
//      (CC_A T_B T_B Wildcard Wildcard (T_A T_B))
//      (T_A Char))
// This is not matched: (CC_B (T_A (T_A Byte Char) (T_A Boolean Boolean)))