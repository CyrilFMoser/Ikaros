package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: Char) extends T_A[C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A Int Byte Wildcard Wildcard Wildcard (T_A Int Byte))