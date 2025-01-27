package Program_25 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: T_A, c: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, CC_A(CC_B(_, _, _))) => 1 
}
}
// This is not matched: CC_B(_, _, CC_A(CC_A(_)))