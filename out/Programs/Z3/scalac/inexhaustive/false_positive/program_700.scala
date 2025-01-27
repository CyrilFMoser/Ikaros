package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,Byte)) extends T_A[C, T_A[C, C]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_C Int
//      Boolean
//      Wildcard
//      (CC_A Boolean
//            Boolean
//            (CC_A Boolean Byte Wildcard (T_A Byte Boolean))
//            (T_A Boolean Boolean))
//      Wildcard
//      (T_B Int Boolean))