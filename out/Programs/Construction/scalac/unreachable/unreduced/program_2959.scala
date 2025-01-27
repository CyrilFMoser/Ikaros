package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[T_A]) extends T_A
case class CC_B(a: T_B[T_B[CC_A]], b: Byte, c: T_B[T_A]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: Int) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}