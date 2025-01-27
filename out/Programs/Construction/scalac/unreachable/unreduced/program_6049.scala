package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char) extends T_A
case class CC_B() extends T_B[T_A]
case class CC_C(a: CC_A, b: T_B[T_B[T_A]], c: CC_A) extends T_B[T_A]
case class CC_D() extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A('x'), _, CC_A(_)) => 1 
  case CC_C(CC_A(_), _, CC_A(_)) => 2 
  case CC_D() => 3 
}
}