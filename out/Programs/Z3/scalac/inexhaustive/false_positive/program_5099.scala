package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: (Int,Byte)) extends T_A[D, C]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)