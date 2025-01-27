package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_C[G](a: (Byte,Byte)) extends T_B[G]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C((0,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants