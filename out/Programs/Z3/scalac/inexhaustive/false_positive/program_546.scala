package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[Int, Byte], C]

val v_a: T_A[T_A[Int, Byte], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_C Wildcard (CC_A Boolean T_A) Wildcard T_A)