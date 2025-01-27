package Program_31 

package Program_12 

object Test {
sealed trait T_A
case class CC_A(a: (Char,T_A)) extends T_A
case class CC_B[A](a: A, b: A) extends T_A
case class CC_C[B](a: ((Byte,Int),Int)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(((_,_),12)) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B Byte
//      Wildcard
//      (CC_A Byte Wildcard Wildcard (T_A Byte))
//      (CC_B Byte
//            Wildcard
//            (CC_B Byte Int Wildcard Wildcard (T_A Byte))
//            (CC_A Byte
//                  (CC_A Byte Wildcard Wildcard (T_A Byte))
//                  Wildcard
//                  (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))