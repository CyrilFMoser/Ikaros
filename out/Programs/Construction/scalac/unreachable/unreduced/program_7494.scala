package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Boolean, c: Int) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Int, b: T_B[(T_A,(Byte,Char)), T_B[(Byte,Char), CC_B]]) extends T_A
case class CC_D[C]() extends T_B[C, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}