package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C, c: (T_A[T_B, T_B],T_B)) extends T_A[C, (T_B,T_A[T_B, Int])]
case class CC_B(a: CC_A[Char], b: T_B) extends T_B
case class CC_C(a: T_B, b: CC_A[T_B], c: CC_B) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), CC_B(_, _)) => 0 
  case CC_B(CC_A(_, _, _), CC_C(_, _, _)) => 1 
  case CC_C(_, _, CC_B(_, _)) => 2 
  case CC_D() => 3 
}
}
// This is not matched: CC_B(CC_A(_, _, _), CC_D())