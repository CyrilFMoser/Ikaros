package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Byte,Byte)], b: (Int,Byte)) extends T_A[(Int,Boolean)]

val v_a: T_A[(Int,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_)) => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)