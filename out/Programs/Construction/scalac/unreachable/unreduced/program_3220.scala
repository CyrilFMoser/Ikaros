package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, Int]]) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C[C](a: T_A, b: (Char,T_B[CC_A, T_A]), c: CC_B) extends T_B[C, T_A]
case class CC_D[D](a: T_A) extends T_B[D, T_A]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _, _) => 0 
  case CC_C(CC_B(_), _, _) => 1 
  case CC_D(CC_A(_)) => 2 
  case CC_D(CC_B(_)) => 3 
}
}