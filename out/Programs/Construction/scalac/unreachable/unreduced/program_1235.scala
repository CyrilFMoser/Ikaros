package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_A, b: T_B[CC_A], c: Char) extends T_A
case class CC_D[B](a: Boolean, b: (T_B[CC_C],CC_B), c: CC_A) extends T_B[CC_B]
case class CC_E(a: T_A, b: Char) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_A(_), _) => 1 
  case CC_E(CC_C(_, _, _), _) => 2 
}
}
// This is not matched: CC_E(CC_B(_), _)