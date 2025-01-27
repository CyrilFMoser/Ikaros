package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_A[T_A[T_B, Int], T_A[T_B, T_B]], C]
case class CC_B[D](a: (T_B,(T_B,Byte))) extends T_A[T_A[T_A[T_B, Int], T_A[T_B, T_B]], D]
case class CC_C(a: CC_A[T_A[T_B, T_B]]) extends T_B
case class CC_D(a: T_A[Boolean, Int], b: T_B) extends T_B
case class CC_E(a: CC_A[T_A[CC_C, CC_D]], b: CC_C, c: CC_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, CC_D(_, _)) => 1 
  case CC_D(_, CC_E(_, _, _)) => 2 
  case CC_E(_, CC_C(CC_A(_)), _) => 3 
}
}
// This is not matched: CC_D(_, CC_C(CC_A(_)))