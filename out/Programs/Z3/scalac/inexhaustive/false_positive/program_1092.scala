package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Char,Byte)) extends T_A[T_A[Boolean, Int], (Char,Char)]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_B Int Wildcard Wildcard Wildcard (T_A Int))