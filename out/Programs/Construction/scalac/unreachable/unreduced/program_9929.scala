package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, Int]) extends T_A[C, Int]
case class CC_B[D](a: T_B, b: (T_A[T_B, T_B],T_A[T_B, Int])) extends T_B
case class CC_C(a: CC_B[CC_B[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), (_,_)), (_,CC_A(_, _))) => 0 
  case CC_B(CC_C(CC_B(_, _)), (_,CC_A(_, _))) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_B(CC_B(CC_C(_), (_,_)), (_,CC_A(_, _)))