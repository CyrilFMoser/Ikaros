package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: Byte) extends T_A[D]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard Wildcard (T_A Int Char))