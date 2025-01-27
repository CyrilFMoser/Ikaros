package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D, E](a: (T_B,Byte)) extends T_A[D, E]

val v_a: CC_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B((_,0)) => 0 
}
}
// This is not matched: (CC_B (Tuple Wildcard (CC_B Wildcard T_B)) T_B)