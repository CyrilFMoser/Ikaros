package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: Char) extends T_A
case class CC_B(a: Char, b: CC_A) extends T_A
case class CC_C[B](a: B) extends T_A
case class CC_D(a: (((Byte,Int),T_A),CC_B)) extends T_B[(T_B[CC_A],Boolean)]
case class CC_E(a: T_B[Int]) extends T_B[(T_B[CC_A],Boolean)]
case class CC_F(a: Char) extends T_B[(T_B[CC_A],Boolean)]

val v_a: T_B[(T_B[CC_A],Boolean)] = null
val v_b: Int = v_a match{
  case CC_E(_) => 0 
  case CC_F(_) => 1 
}
}
// This is not matched: CC_D(((_,_),CC_B(_, _)))