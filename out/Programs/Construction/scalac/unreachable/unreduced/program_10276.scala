package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[CC_A], b: CC_A, c: CC_A) extends T_A
case class CC_C(a: (T_B[CC_A],CC_B)) extends T_A
case class CC_D(a: CC_B, b: (Char,T_A)) extends T_B[CC_B]
case class CC_E() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C((_,_))) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C(_) => 6 
}
}