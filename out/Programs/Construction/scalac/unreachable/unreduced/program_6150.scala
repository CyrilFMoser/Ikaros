package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[Int, D]
case class CC_B[E](a: T_B[E], b: CC_A[E]) extends T_B[E]
case class CC_C(a: CC_B[Byte], b: CC_A[T_B[Byte]], c: Byte) extends T_B[(CC_B[Char],Int)]

val v_a: T_B[(CC_B[Char],Int)] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), CC_A(_)), CC_A(_)) => 0 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(_)), CC_A(_)) => 1 
  case CC_B(CC_C(CC_B(_, _), _, _), CC_A(_)) => 2 
  case CC_C(_, _, _) => 3 
}
}