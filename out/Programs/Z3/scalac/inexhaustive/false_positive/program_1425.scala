package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: (Byte,Int)) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,12)) => 0 
}
}
// This is not matched: (CC_B (T_A (Tuple Int Char)))