package Program_15 

object Test {
sealed trait T_B[C, D]
case class CC_D[K, J](a: (Byte,Char)) extends T_B[K, J]

val v_a: CC_D[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_D((_,'x')) => 0 
}
}
// This is not matched: Pattern match is empty without constants