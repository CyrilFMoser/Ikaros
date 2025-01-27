package Program_12 

package Program_4 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 2 
  case CC_A(_, CC_A(_, _, _), _) => 3 
  case CC_A(_, _, _) => 4 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A (CC_B T_B T_B)
//      (Tuple (CC_D T_B
//                   (CC_A T_B Wildcard (T_A T_B))
//                   Wildcard
//                   (CC_A (CC_B T_B T_B) Wildcard (T_A (CC_B T_B T_B)))
//                   T_B)
//             (CC_C Boolean T_B))
//      (T_A (CC_B T_B T_B)))