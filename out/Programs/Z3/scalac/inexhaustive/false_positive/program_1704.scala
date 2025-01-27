package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Int), b: T_A[(Boolean,Int)]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((_,12), _) => 0 
}
}
// This is not matched: (CC_A Byte (T_A Byte))