package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_B(a: T_B) extends T_A[T_B, T_B]
case class CC_C(a: T_A[T_A[T_B, CC_B], T_B]) extends T_A[T_B, T_B]
case class CC_D[C](a: T_A[T_B, T_B], b: CC_B, c: T_A[T_B, T_B]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_D[T_A[(Boolean,Int), CC_B]], b: T_B) extends T_B

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), CC_B(_), CC_A(_)) => 0 
  case CC_D(CC_B(_), CC_B(_), CC_A(_)) => 1 
  case CC_D(CC_C(_), CC_B(_), CC_A(_)) => 2 
  case CC_D(CC_A(_), CC_B(_), CC_B(_)) => 3 
  case CC_D(CC_B(_), CC_B(_), CC_B(_)) => 4 
  case CC_D(CC_C(_), CC_B(_), CC_B(_)) => 5 
  case CC_D(CC_A(_), CC_B(_), CC_C(_)) => 6 
  case CC_D(CC_B(_), CC_B(_), CC_C(_)) => 7 
  case CC_D(CC_C(_), CC_B(_), CC_C(_)) => 8 
}
}