package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: (Int,Char)) extends T_A[D, C]

val v_a: CC_A[Boolean, T_A[T_A[Int, Int], CC_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)