package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C, c: T_A[C, C]) extends T_A[Boolean, C]
case class CC_B[D](a: T_A[Boolean, D], b: T_A[Boolean, D]) extends T_A[Boolean, D]
case class CC_C(a: CC_B[Char]) extends T_B
case class CC_D(a: T_A[Boolean, CC_A[(Int,Int)]], b: T_A[T_A[Boolean, CC_C], CC_A[CC_C]], c: Boolean) extends T_B
case class CC_E(a: CC_B[CC_D]) extends T_B

val v_a: T_A[Boolean, CC_E] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), _, _) => 0 
  case CC_A(CC_D(_, _, _), _, _) => 1 
  case CC_A(CC_E(CC_B(_, _)), _, _) => 2 
  case CC_B(CC_A(CC_C(_), CC_E(_), _), _) => 3 
  case CC_B(CC_A(CC_E(_), CC_E(_), _), _) => 4 
  case CC_B(CC_B(CC_A(_, _, _), CC_A(_, _, _)), _) => 5 
  case CC_B(CC_B(CC_B(_, _), CC_A(_, _, _)), _) => 6 
  case CC_B(CC_B(CC_A(_, _, _), CC_B(_, _)), _) => 7 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), _) => 8 
}
}
// This is not matched: CC_B(CC_A(CC_D(_, _, _), CC_E(_), _), _)