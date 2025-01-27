package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C(a: T_A[T_B, Char], b: Byte, c: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_D(a: (CC_B[Char],CC_B[CC_C]), b: T_A[CC_A[T_B], Boolean], c: T_A[T_B, T_A[CC_C, CC_C]]) extends T_B
case class CC_E(a: CC_B[CC_B[CC_D]], b: CC_D, c: CC_B[Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _, CC_A(_)) => 0 
  case CC_C(CC_B(_), _, CC_A(_)) => 1 
  case CC_C(CC_A(_), _, CC_B(_)) => 2 
  case CC_C(CC_B(_), _, CC_B(_)) => 3 
  case CC_D(_, _, _) => 4 
  case CC_E(_, _, _) => 5 
}
}