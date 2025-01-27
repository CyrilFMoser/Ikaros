package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (Char,Int)) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,12)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (T_A Int)))