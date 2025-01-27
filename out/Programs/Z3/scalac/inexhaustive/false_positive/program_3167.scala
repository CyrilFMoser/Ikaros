package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: (Int,Boolean)) extends T_A[D, C]

val v_a: CC_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: (CC_B Byte Int Wildcard Wildcard (T_A Byte Int))