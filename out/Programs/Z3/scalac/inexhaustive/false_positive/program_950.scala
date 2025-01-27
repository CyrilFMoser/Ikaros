package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Char,Boolean),Byte), b: T_A[Int, C]) extends T_A[C, T_A[Byte, (Byte,Char)]]

val v_a: T_A[Char, T_A[Byte, (Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A((_,0), _) => 0 
}
}
// This is not matched: (CC_C (CC_D T_B) T_B)