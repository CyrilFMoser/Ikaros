package Program_15 

object Test {
sealed trait T_B[B, C]
case class CC_B[E, F](a: (Int,Boolean)) extends T_B[E, F]

val v_a: CC_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_B((12,_)) => 0 
}
}
// This is not matched: (CC_B T_A)