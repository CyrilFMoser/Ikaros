package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: Boolean, c: T_B[T_A, Int]) extends T_A
case class CC_B(a: Char, b: T_B[((Boolean,Boolean),CC_A), Int]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: Int) extends T_B[C, T_B[C, C]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}