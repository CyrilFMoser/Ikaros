package Program_27 

package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A, c: A) extends T_A

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), 0) => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
  case CC_A(CC_A(_, _, _), _, 0) => 2 
  case CC_A(_, CC_A(_, _, _), _) => 3 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 4 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), 0) => 5 
}
}
// This is not matched: (CC_A Byte
//      (CC_A Boolean Wildcard Wildcard Boolean T_A)
//      (CC_A T_A
//            Wildcard
//            (CC_A Boolean Wildcard Wildcard Boolean T_A)
//            Wildcard
//            T_A)
//      Byte
//      T_A)
// This is not matched: (CC_A Wildcard
//      (CC_A Byte
//            (CC_B Wildcard Wildcard (CC_B Boolean Wildcard Wildcard T_A) T_A)
//            T_A)
//      T_A)