package Program_31 

object Test {
sealed trait T_B[C]
case class CC_D[F](a: Int) extends T_B[F]

val v_a: CC_D[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_A T_A)