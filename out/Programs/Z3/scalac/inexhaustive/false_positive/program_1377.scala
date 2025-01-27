package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Byte)) extends T_A[T_A[Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_C T_A) T_A)