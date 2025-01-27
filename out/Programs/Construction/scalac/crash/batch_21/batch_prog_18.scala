package Program_18 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Byte, c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, _) => 0 
  case CC_A(CC_A(CC_B(), _, CC_A(_, _, _)), _, _) => 1 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B()), _, _) => 2 
  case CC_A(CC_A(CC_B(), _, CC_B()), _, _) => 3 
  case CC_A(CC_B(), _, _) => 4 
  case CC_B() => 5 
}
}