package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: CC_C) extends T_B[CC_C]
case class CC_E(a: T_B[T_A], b: ((CC_B,CC_D),CC_A), c: CC_C) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_)) => 0 
  case CC_E(_, (_,_), CC_C(_)) => 1 
}
}