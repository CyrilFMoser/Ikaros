package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,Byte), b: T_A[C, C]) extends T_A[C, T_A[Int, Char]]

val v_a: T_A[Int, T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_A((0,_), _) => 0 
}
}
// This is not matched: (CC_A T_A)