package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: Char) extends T_A[C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_D (Tuple Wildcard (CC_C T_B)) T_B)