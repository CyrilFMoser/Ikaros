package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Byte,Char)) extends T_A[(Byte,Char), C]

val v_a: T_A[(Byte,Char), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (0,_)) => 0 
}
}
// This is not matched: (CC_A Boolean (T_A Boolean))