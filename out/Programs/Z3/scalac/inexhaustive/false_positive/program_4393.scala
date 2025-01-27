package Program_8 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: (Char,Char)) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_A((_,'x')) => 1 
  case CC_A(_) => 2 
  case CC_A(('x',_)) => 3 
}
}
// This is not matched: (CC_A Char Boolean Wildcard (T_A Char))
// This is not matched: (CC_A Byte
//      Wildcard
//      (CC_A Byte
//            Wildcard
//            (CC_A Byte
//                  Byte
//                  (CC_B Byte Wildcard Wildcard Wildcard (T_A Byte))
//                  (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))