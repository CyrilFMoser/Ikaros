package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: Char) extends T_A
case class CC_B(a: Int, b: T_A, c: CC_A) extends T_A
case class CC_C(a: Int, b: CC_B) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, CC_A(_, _), _)) => 0 
  case CC_C(_, CC_B(_, CC_B(_, _, _), _)) => 1 
}
}