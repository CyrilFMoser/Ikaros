package Program_14 

object Test {
sealed trait T_B[C]
case class CC_C[H]() extends T_B[H]
case class CC_D[I](a: T_B[I]) extends T_B[I]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants