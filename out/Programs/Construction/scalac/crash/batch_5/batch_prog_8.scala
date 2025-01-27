package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Byte, Int],Boolean), b: T_A[T_A[Int, Int], T_A[Boolean, Char]]) extends T_A[T_A[T_A[Boolean, Int], T_A[Char, Int]], T_A[(Byte,Byte), T_A[Boolean, Char]]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
}
}