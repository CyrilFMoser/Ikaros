package Program_13 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A) extends T_A
case class CC_B[A](a: CC_A, b: (Byte,T_B), c: CC_A) extends T_A
case class CC_C() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C())) => 2 
  case CC_A(CC_B(CC_A(_), _, CC_A(_))) => 3 
  case CC_B(_, (_,_), CC_A(CC_A(_))) => 4 
  case CC_B(_, (_,_), CC_A(CC_B(_, _, _))) => 5 
  case CC_B(_, (_,_), CC_A(CC_C())) => 6 
  case CC_C() => 7 
}
}
// This is not matched: CC_A(CC_C())