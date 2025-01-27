package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: Int, b: T_B[CC_A, Char]) extends T_A
case class CC_C[C](a: T_B[C, C]) extends T_A
case class CC_D[D, E](a: E) extends T_B[D, CC_C[T_B[CC_B, (Boolean,Byte)]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_C(_)) => 3 
  case CC_B(_, _) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_A(CC_B(_, _))