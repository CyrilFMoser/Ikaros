package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(Int,T_B)], b: T_A[T_B], c: T_B) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_A[Boolean]], b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C(a: CC_A) extends T_B
case class CC_D(a: (T_A[T_B],CC_B), b: T_A[CC_B], c: T_A[T_A[Boolean]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D((_,CC_B(_, _)), _, CC_A(_, _, _)) => 1 
  case CC_D((_,CC_B(_, _)), _, CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 2 
  case CC_D((_,CC_B(_, _)), _, CC_B(CC_B(_, _), CC_A(_, _, _))) => 3 
  case CC_D((_,CC_B(_, _)), _, CC_B(CC_B(_, _), CC_B(_, _))) => 4 
}
}
// This is not matched: CC_D((_,CC_B(_, _)), _, CC_B(CC_A(_, _, _), CC_B(_, _)))