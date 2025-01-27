package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B], c: Int) extends T_A[T_A[((Boolean,Char),T_B)]]
case class CC_B(a: Int) extends T_B
case class CC_C(a: T_A[T_B]) extends T_B
case class CC_D(a: T_B, b: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
  case CC_D(CC_B(_), _) => 2 
  case CC_D(CC_C(_), _) => 3 
  case CC_D(CC_D(_, _), _) => 4 
}
}