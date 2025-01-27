package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Int,Int), b: T_A[Int]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard (T_A (T_A Byte)))