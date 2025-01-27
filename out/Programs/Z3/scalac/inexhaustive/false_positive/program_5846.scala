package Program_15 

object Test {
sealed trait T_B[C, D]
case class CC_D[H](a: Byte) extends T_B[T_B[Byte, Char], H]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants