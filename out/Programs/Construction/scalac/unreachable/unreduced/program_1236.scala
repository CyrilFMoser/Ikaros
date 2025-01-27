package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B, c: (T_B,T_B)) extends T_A[C, T_B]
case class CC_B[D, E](a: T_A[T_A[D, T_B], T_B], b: (CC_A[T_B],CC_A[T_B])) extends T_A[D, T_B]
case class CC_C[F](a: Byte, b: CC_B[F, F], c: T_A[F, F]) extends T_A[F, T_B]
case class CC_D(a: T_A[T_A[Char, T_B], T_B]) extends T_B
case class CC_E(a: T_B, b: (T_A[CC_D, T_B],T_A[CC_D, T_B])) extends T_B

val v_a: CC_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), (_,_)) => 0 
  case CC_B(CC_C(_, _, _), (_,_)) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _, _), (_,_))