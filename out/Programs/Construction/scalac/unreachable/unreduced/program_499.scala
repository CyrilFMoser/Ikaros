package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[((Int,Char),T_A)]) extends T_A
case class CC_B(a: T_A, b: CC_A, c: CC_A) extends T_B[T_B[CC_A]]
case class CC_C() extends T_B[T_B[CC_A]]
case class CC_D(a: CC_A) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 0 
  case CC_C() => 1 
  case CC_D(CC_A(_, _)) => 2 
}
}