package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Int, c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants