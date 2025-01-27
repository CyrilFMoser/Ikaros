package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Int,Byte)], b: (Char,Int)) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_)) => 0 
}
}
// This is not matched: (CC_A Byte T_A)