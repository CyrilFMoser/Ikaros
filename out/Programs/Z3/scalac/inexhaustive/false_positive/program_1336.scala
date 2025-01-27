package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: (Char,Char)) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_)) => 0 
}
}
// This is not matched: (CC_E T_B Wildcard T_B)