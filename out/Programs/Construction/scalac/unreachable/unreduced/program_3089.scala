package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[CC_A, T_A]
case class CC_D(a: T_A, b: Boolean, c: (Boolean,T_B[Byte, Int])) extends T_B[CC_A, T_A]
case class CC_E() extends T_B[CC_A, T_A]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _, (true,_)) => 0 
  case CC_D(CC_A(), _, (false,_)) => 1 
  case CC_D(CC_B(), _, (true,_)) => 2 
  case CC_D(CC_B(), _, (false,_)) => 3 
  case CC_E() => 4 
}
}
// This is not matched: CC_C()