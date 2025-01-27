package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: (CC_A,CC_A), b: Int) extends T_A
case class CC_C(a: (T_A,T_B[T_A, Char])) extends T_A
case class CC_D[C](a: CC_A) extends T_B[CC_C, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}