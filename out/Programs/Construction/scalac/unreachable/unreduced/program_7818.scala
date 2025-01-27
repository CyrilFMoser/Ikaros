package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B(a: T_B, b: T_B) extends T_B
case class CC_C(a: CC_A[T_A[T_B, CC_B]], b: Byte, c: T_A[T_A[T_B, Int], T_A[T_B, Int]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), _) => 0 
  case CC_B(CC_B(CC_C(_, _, _), _), _) => 1 
  case CC_B(CC_C(CC_A(), _, _), _) => 2 
  case CC_C(_, _, _) => 3 
}
}