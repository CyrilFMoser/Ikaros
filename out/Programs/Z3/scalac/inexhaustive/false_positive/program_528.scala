package Program_31 

object Test {
sealed trait T_B[A]
case class CC_B[B](a: B) extends T_B[B]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants