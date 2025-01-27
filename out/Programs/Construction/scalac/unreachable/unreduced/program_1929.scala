package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: CC_A) extends T_A
case class CC_D(a: CC_C, b: CC_A) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_, CC_A(_, _))) => 2 
  case CC_C(_, CC_A(_, CC_B())) => 3 
  case CC_C(_, CC_A(_, CC_C(_, _))) => 4 
}
}