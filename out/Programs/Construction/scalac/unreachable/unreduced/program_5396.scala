package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[Char, Char], C], b: T_B) extends T_A[T_A[Char, Char], C]
case class CC_B[D](a: D, b: CC_A[D]) extends T_A[T_A[Char, Char], D]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_A[Char, Char], CC_C], b: (T_B,CC_B[Int]), c: T_A[T_A[T_B, (Char,Boolean)], Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(CC_B(_, _), CC_C()), _, _) => 1 
  case CC_D(CC_A(CC_A(_, _), CC_D(_, _, _)), _, _) => 2 
  case CC_D(CC_A(CC_B(_, _), CC_D(_, _, _)), _, _) => 3 
  case CC_D(CC_B(CC_C(), _), _, _) => 4 
}
}
// This is not matched: CC_D(CC_A(CC_A(_, _), CC_C()), _, _)