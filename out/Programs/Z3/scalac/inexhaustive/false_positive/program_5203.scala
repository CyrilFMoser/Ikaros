package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte) extends T_A[B]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_C Int Wildcard Wildcard (CC_A Int (T_A Int)) (T_A Int))