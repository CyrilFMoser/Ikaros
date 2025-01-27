package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: T_B) extends T_A[T_A[T_B, T_A[Char, T_B]], C]
case class CC_B(a: CC_A[T_B], b: T_A[T_A[T_B, Char], CC_A[Int]]) extends T_B
case class CC_C(a: CC_A[CC_A[CC_B]], b: CC_B, c: T_B) extends T_B
case class CC_D(a: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(CC_B(_, _)) => 2 
}
}