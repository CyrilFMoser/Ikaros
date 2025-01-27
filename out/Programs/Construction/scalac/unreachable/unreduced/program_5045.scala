package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Int]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Char, b: Boolean, c: Int) extends T_A
case class CC_D(a: Char, b: Boolean, c: T_B[Boolean]) extends T_B[Boolean]
case class CC_E(a: (CC_C,CC_D), b: T_B[CC_B], c: Byte) extends T_B[Boolean]
case class CC_F(a: (T_B[(Char,Byte)],(Boolean,T_A))) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}