package Program_13 

object Test {
sealed trait T_A[A]
case class CC_C(a: (Char,Byte)) extends T_A[T_A[Boolean]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((_,0)) => 0 
}
}
// This is not matched: Pattern match is empty without constants