package Program_61 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: (Int,Char)) extends T_A[C]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: Pattern match is empty without constants