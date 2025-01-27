package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char) extends T_A
case class CC_B() extends T_A
case class CC_C[B](a: T_B[B], b: Boolean) extends T_B[CC_A]
case class CC_D(a: CC_A, b: (T_B[Boolean],(CC_B,CC_A)), c: CC_B) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(_), (_,(_,_)), _) => 1 
}
}