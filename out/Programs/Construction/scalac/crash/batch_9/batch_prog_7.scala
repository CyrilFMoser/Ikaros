package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: Char) extends T_A
case class CC_B[B]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: CC_A(_)