package Program_10 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_A, b: (CC_A,Byte)) extends T_A
case class CC_C() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_B(_, (_,_)), (CC_A(_, _),_)) => 1 
  case CC_B(CC_C(), (CC_A(_, _),_)) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B(CC_A(_, _), (CC_A(_, _),_))