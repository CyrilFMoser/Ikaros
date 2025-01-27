package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_B,(T_B,Boolean))]
case class CC_B(a: T_A[T_A[CC_A]], b: T_B, c: Char) extends T_A[(T_B,(T_B,Boolean))]
case class CC_C() extends T_B
case class CC_D(a: CC_C, b: T_A[Boolean], c: CC_A) extends T_B
case class CC_E(a: CC_C, b: T_B, c: (CC_C,(T_B,CC_A))) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, CC_A()) => 1 
  case CC_E(CC_C(), CC_C(), (CC_C(),(_,_))) => 2 
  case CC_E(CC_C(), CC_D(_, _, _), (CC_C(),(_,_))) => 3 
  case CC_E(CC_C(), CC_E(CC_C(), _, (_,_)), (CC_C(),(_,_))) => 4 
}
}