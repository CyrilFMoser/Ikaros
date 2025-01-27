package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Char,Byte)) extends T_A[C, (Byte,Byte)]

val v_a: T_A[Boolean, (Byte,Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,0)) => 0 
}
}
// This is not matched: (CC_A Byte Int Wildcard (T_A Byte))