package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: Int) extends T_A[D]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants