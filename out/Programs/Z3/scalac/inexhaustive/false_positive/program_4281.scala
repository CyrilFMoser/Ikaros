package Program_13 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: (Int,Char)) extends T_A[C]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      (Tuple (CC_B Wildcard Wildcard (CC_A Int Wildcard Wildcard T_A) T_A) Int)
//      Wildcard
//      T_A)