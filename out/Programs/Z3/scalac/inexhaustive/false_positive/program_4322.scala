package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: F) extends T_A[((Boolean,Byte),Char), F]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B (CC_B (CC_B Wildcard T_A) T_A) T_A)