package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A Boolean))
// This is not matched: (CC_A Boolean
//      Byte
//      Wildcard
//      (CC_B Byte
//            Boolean
//            (CC_A Boolean Byte Wildcard Wildcard (T_A Boolean Byte))
//            Wildcard
//            (T_A Byte Boolean))
//      (T_A Boolean Byte))