package Program_31 

object Test {
sealed trait T_B[B, C]
case class CC_D[I, J](a: Char) extends T_B[I, J]

val v_a: CC_D[Int, Char] = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
}
}
// This is not matched: (CC_B Int Int Wildcard (T_A Int Int))