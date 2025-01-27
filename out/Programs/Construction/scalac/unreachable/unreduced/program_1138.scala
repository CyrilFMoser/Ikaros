package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A]) extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[CC_A, CC_A], T_A]) extends T_A
case class CC_C[C](a: T_A) extends T_A
case class CC_D(a: CC_C[T_B[CC_A, Byte]]) extends T_B[CC_A, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_)