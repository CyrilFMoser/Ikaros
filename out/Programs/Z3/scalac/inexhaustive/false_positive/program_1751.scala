package Program_31 

package Program_0 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A, c: A) extends T_A
case class CC_B(a: Boolean, b: Char) extends T_A

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_, _), _) => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
  case CC_A(CC_B(_, _), CC_B(_, _), _) => 2 
  case CC_A(CC_A(_, _, _), _, 0) => 3 
  case CC_A(CC_B(_, _), CC_B(_, _), 0) => 4 
  case CC_A(CC_B(_, _), _, _) => 5 
  case CC_A(CC_B(_, _), _, 0) => 6 
}
}
// This is not matched: (CC_A Byte
//      (CC_A T_A
//            (CC_B Wildcard Wildcard T_A)
//            (CC_A Boolean
//                  (CC_B Boolean Wildcard T_A)
//                  (CC_A Boolean
//                        (CC_A T_A Wildcard Wildcard Wildcard T_A)
//                        (CC_A Wildcard Wildcard Wildcard Boolean T_A)
//                        Boolean
//                        T_A)
//                  Boolean
//                  T_A)
//            Wildcard
//            T_A)
//      (CC_A T_A Wildcard Wildcard Wildcard T_A)
//      Wildcard
//      T_A)
// This is not matched: (CC_C Boolean Wildcard (T_B (CC_A Int Boolean Boolean) Boolean))