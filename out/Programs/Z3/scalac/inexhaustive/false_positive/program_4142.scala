package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[Int, C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A Boolean))