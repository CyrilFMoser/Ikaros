package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,Byte), b: T_A[C, C]) extends T_A[(Byte,Byte), C]

val v_a: T_A[(Byte,Byte), Char] = null
val v_b: Int = v_a match{
  case CC_A((_,0), _) => 0 
}
}
// This is not matched: (CC_A Char (CC_D T_B) Wildcard Wildcard (T_A T_B Char))