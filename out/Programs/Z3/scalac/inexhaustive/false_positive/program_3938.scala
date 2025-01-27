package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (Byte,T_B)) extends T_A[T_B, C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants