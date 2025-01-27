package Program_27 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A, c: Char) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}