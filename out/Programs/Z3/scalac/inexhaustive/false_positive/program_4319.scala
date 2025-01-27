package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Byte,Char),Byte), b: T_A[C, C]) extends T_A[C, T_A[Boolean, Boolean]]

val v_a: T_A[CC_A[Int], T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((_,0), _) => 0 
}
}
// This is not matched: (CC_B T_A T_A)