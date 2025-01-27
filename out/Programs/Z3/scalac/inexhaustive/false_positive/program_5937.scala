package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (Int,Boolean)) extends T_A[((Char,Byte),Byte)]

val v_a: T_A[((Char,Byte),Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_)) => 0 
}
}
// This is not matched: (CC_E T_B Wildcard T_B)