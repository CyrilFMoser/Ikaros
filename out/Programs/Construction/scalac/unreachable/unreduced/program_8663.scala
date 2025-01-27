package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],Byte)) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[CC_C]
case class CC_E() extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_A((_,_))) => 1 
  case CC_B(CC_B(CC_A(_))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C())) => 4 
  case CC_B(CC_C()) => 5 
  case CC_C() => 6 
}
}