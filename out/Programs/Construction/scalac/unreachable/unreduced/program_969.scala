package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,T_A)], b: T_A) extends T_A
case class CC_B(a: T_B[CC_A], b: T_A, c: (T_B[CC_A],T_A)) extends T_A
case class CC_C() extends T_A
case class CC_D(a: (T_B[CC_B],CC_C), b: CC_C, c: CC_A) extends T_B[CC_C]
case class CC_E(a: Int) extends T_B[CC_C]
case class CC_F() extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}