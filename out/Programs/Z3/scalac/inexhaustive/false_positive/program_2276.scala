package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Char,Byte)) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_A Byte (T_A Byte))