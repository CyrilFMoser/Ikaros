package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: Int, c: CC_A) extends T_A
case class CC_C(a: Int, b: (CC_B,Byte), c: T_B[CC_A, CC_B]) extends T_A
case class CC_D[C](a: CC_C, b: C, c: Char) extends T_B[C, Boolean]
case class CC_E[D](a: T_B[D, Boolean], b: T_A, c: Int) extends T_B[D, Boolean]

val v_a: T_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, (_,_), _), true, _) => 0 
  case CC_D(CC_C(_, (_,_), _), false, _) => 1 
  case CC_E(_, _, _) => 2 
}
}