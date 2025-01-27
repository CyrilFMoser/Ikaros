package Program_22 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B(a: ((Boolean,CC_A),T_A)) extends T_A
case class CC_C(a: Char, b: CC_B, c: T_A) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_B(_))) => 0 
  case CC_A(CC_A(CC_C(_, _, _))) => 1 
  case CC_A(CC_B((_,_))) => 2 
  case CC_A(CC_C(_, _, _)) => 3 
}
}
// This is not matched: CC_A(CC_A(CC_A(_)))