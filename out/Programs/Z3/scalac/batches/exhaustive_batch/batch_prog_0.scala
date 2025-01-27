package Program_0 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_A, c: T_A) extends T_A
case class CC_B() extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}