package Program_15 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A, c: (Char,Int)) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}