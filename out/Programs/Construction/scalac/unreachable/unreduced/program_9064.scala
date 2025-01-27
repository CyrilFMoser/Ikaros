package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_B, T_A[T_B, T_B]], T_A[T_B, (T_B,Boolean)]]
case class CC_B() extends T_A[T_A[T_B, T_A[T_B, T_B]], T_A[T_B, (T_B,Boolean)]]
case class CC_C(a: T_B, b: CC_B) extends T_B
case class CC_D(a: Boolean, b: T_B) extends T_B
case class CC_E(a: T_A[Char, CC_A]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _), CC_B()), CC_B()) => 0 
  case CC_C(CC_C(CC_D(_, _), CC_B()), CC_B()) => 1 
  case CC_C(CC_C(CC_E(_), CC_B()), CC_B()) => 2 
  case CC_C(CC_D(_, _), CC_B()) => 3 
  case CC_C(CC_E(_), CC_B()) => 4 
  case CC_D(_, _) => 5 
  case CC_E(_) => 6 
}
}