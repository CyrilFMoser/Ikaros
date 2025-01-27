package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, Byte], b: (Char,(Char,Char))) extends T_A[T_A[Int, Int], Int]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)