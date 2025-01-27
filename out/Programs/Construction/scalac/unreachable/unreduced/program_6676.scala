package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: (Byte,T_B[(Byte,Boolean)])) extends T_A
case class CC_B() extends T_B[CC_A]
case class CC_C() extends T_B[CC_A]
case class CC_D(a: CC_C, b: T_A, c: T_B[CC_C]) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_D(_, CC_A(_, (_,_)), _) => 2 
}
}