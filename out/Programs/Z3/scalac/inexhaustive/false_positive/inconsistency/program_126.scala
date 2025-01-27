package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,Byte), b: T_A[C, C]) extends T_A[T_A[Char, Byte], C]

val v_a: T_A[T_A[Char, Byte], Char] = null
val v_b: Int = v_a match{
  case CC_A((_,0), _) => 0 
}
}
// This is not matched: (CC_D Char (CC_A Char Char (T_A Char)) (T_B (CC_A Char Boolean Boolean) Char))