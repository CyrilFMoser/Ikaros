package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A]) extends T_A
case class CC_B(a: T_A, b: CC_A, c: T_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C](a: T_B[C, C], b: C, c: T_A) extends T_B[Byte, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B(_, _, CC_A(_))) => 1 
  case CC_C(CC_B(_, _, CC_B(_, _, _))) => 2 
  case CC_C(CC_B(_, _, CC_C(_))) => 3 
}
}
// This is not matched: CC_A(_)