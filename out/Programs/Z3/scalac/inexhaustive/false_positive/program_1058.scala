package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Byte (CC_A Byte (T_A Byte)) Wildcard (T_A Byte))