package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[T_B[T_A, CC_A], T_B[T_A, CC_A]], b: T_B[T_A, T_B[Char, Byte]]) extends T_A
case class CC_C[C](a: T_A) extends T_B[T_B[T_A, CC_A], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B(CC_C(CC_A(_, _)), _) => 1 
  case CC_B(CC_C(CC_B(_, _)), _) => 2 
}
}
// This is not matched: CC_A(CC_B(CC_C(_), _), _)