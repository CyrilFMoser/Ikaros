package Program_13 

object Test {
sealed trait T_A[A]
case class CC_B[F](a: Char) extends T_A[F]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Byte Byte Wildcard (T_A Byte Byte))