package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: (Byte,Char)) extends T_A[T_A[Boolean, Boolean], Byte]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants