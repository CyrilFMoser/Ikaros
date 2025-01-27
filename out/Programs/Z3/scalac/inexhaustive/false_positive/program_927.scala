package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Byte)) extends T_A[C, ((Byte,Boolean),Byte)]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)