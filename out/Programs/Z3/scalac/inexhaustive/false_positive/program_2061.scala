package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Char,Char)) extends T_A[T_A[Byte]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: (CC_A Boolean (CC_A Boolean Wildcard (T_A Boolean)) (T_A Boolean))