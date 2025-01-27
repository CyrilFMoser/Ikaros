package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Char,Char)) extends T_A[T_A[Byte]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: (CC_B (T_A Char Int) (T_A (T_A Char Int) (CC_A Byte Boolean Boolean)))