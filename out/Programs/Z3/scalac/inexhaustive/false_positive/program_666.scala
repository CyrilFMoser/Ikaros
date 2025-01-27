package Program_30 

object Test {
sealed trait T_B[C]
case class CC_B[F](a: Int) extends T_B[F]
case class CC_C() extends T_B[T_B[Char]]

val v_a: CC_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_C Boolean Wildcard (T_A Boolean))