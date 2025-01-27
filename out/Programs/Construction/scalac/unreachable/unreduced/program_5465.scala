package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), ((Byte,Boolean),T_A)]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (T_A,Char)) extends T_A
case class CC_D(a: CC_A, b: CC_C) extends T_B[CC_B, (Byte,Int)]
case class CC_E(a: CC_D) extends T_B[CC_B, (Byte,Int)]
case class CC_F(a: Char, b: Char, c: Char) extends T_B[CC_B, (Byte,Int)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C((CC_B(),_)) => 2 
  case CC_C((CC_C(_),_)) => 3 
}
}
// This is not matched: CC_C((CC_A(_),_))