package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_A], b: T_A, c: T_A) extends T_A
case class CC_B[C](a: Char) extends T_A
case class CC_C(a: T_B[CC_A, T_B[CC_A, T_A]]) extends T_A
case class CC_D[D](a: D, b: CC_A, c: D) extends T_B[D, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _, _), _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}