package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: Boolean, b: Boolean, c: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, _, _)) => 2 
  case CC_B(_, _, CC_A(CC_A(_))) => 3 
  case CC_B(_, _, CC_A(CC_B(_, _, _))) => 4 
}
}