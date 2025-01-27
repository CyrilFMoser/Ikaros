package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Byte, c: T_A) extends T_A
case class CC_B(a: CC_A, b: (T_B[CC_A],T_B[(Int,Char)])) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D(a: T_A) extends T_B[(CC_C,T_A)]
case class CC_E(a: Int, b: CC_A, c: CC_D) extends T_B[CC_C]
case class CC_F() extends T_B[(CC_C,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(CC_A(_, _, _), _), _, _) => 1 
  case CC_A(CC_C(_), _, _) => 2 
  case CC_B(_, (_,_)) => 3 
}
}
// This is not matched: CC_C(CC_B(CC_A(_, _, _), (_,_)))