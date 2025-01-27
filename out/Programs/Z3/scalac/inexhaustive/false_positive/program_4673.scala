package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_D[C](a: Int) extends T_B[C]
case class CC_F() extends T_B[T_B[Boolean]]

val v_a: CC_D[CC_F] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Boolean Boolean))