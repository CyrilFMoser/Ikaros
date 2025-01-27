package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Boolean) extends T_A[T_B]
case class CC_B(a: T_A[T_A[(Char,Char)]]) extends T_B
case class CC_C(a: CC_A) extends T_B
case class CC_D(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
  case CC_D(CC_C(CC_A(_, _))) => 2 
}
}