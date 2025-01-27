package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: (T_A,T_B[T_A])) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[(T_A,Char)]
case class CC_E(a: Char) extends T_B[(T_A,Char)]
case class CC_F(a: T_A) extends T_B[(T_A,Char)]

val v_a: T_B[(T_A,Char)] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_) => 1 
  case CC_F(CC_A(_, _)) => 2 
  case CC_F(CC_C()) => 3 
}
}
// This is not matched: CC_F(CC_B())