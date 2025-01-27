package Program_19 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Boolean, c: T_A) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}