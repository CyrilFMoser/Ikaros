package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Char,Char)) extends T_A[B]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_C T_A)