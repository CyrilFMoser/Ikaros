package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, CC_A], b: CC_A, c: Char) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D() extends T_B[CC_A, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_C(_) => 2 
}
}