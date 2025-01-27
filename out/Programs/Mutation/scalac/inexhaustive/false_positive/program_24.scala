package Program_62 

object Test {
sealed trait T_A[B]
case class CC_A[C](a: T_A[C], b: C) extends T_A[T_A[C]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A (Tuple Byte Byte)))