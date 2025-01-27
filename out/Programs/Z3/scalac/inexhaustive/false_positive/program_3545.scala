package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Char,Boolean)) extends T_A[B]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_A (T_A (T_A Byte)))