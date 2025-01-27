package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,Char)) extends T_A[C, T_A[Int, Char]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: (CC_A Int Wildcard (T_A Int))