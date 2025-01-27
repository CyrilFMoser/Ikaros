package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: (Char,Byte)) extends T_A[C]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_A Byte
//      (CC_A Byte
//            (CC_A Byte (CC_A Byte Wildcard (T_A Byte)) (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))