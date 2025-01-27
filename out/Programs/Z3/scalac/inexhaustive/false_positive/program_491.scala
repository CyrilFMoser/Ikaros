package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, Int], b: (Byte,Boolean)) extends T_A[T_A[Int, Char], T_A[Int, Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, (0,_)) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)