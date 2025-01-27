package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D](a: D, b: T_A[T_B, Boolean], c: T_B) extends T_A[D, Char]
case class CC_C(a: T_A[T_B, Char], b: T_A[T_B, CC_B[T_B]]) extends T_B
case class CC_D(a: T_A[T_A[CC_C, Char], T_B]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_A()) => 0 
  case CC_C(CC_B(_, _, _), CC_A()) => 1 
  case CC_D(_) => 2 
  case CC_E() => 3 
}
}