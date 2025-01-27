package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_A], b: T_A) extends T_A
case class CC_B[C](a: Char) extends T_B[T_B[C, C], C]
case class CC_C[D](a: T_B[D, D]) extends T_B[T_B[D, D], D]

val v_a: T_B[T_B[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}