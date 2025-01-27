package Program_14 

object Test {
sealed trait T_B[C]
case class CC_C[F](a: (Int,Byte)) extends T_B[F]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C((_,0)) => 0 
}
}
// This is not matched: (CC_C Wildcard (CC_A Wildcard T_A) T_A)