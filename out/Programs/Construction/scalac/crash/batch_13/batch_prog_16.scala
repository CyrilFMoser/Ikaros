package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Int], T_B[T_A, (Boolean,Byte)]]) extends T_A
case class CC_B(a: (T_B[CC_A, Boolean],Int), b: T_B[T_B[CC_A, CC_A], T_A]) extends T_A
case class CC_C(a: CC_B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B(_, _)) => 2 
}
}