package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]], b: T_B[(Char,Char), T_A[Int]], c: T_A[(Byte,Boolean)]) extends T_A[T_B[T_A[(Boolean,Int)], T_A[Boolean]]]
case class CC_B(a: T_A[T_B[CC_A, CC_A]]) extends T_A[T_B[T_A[(Boolean,Int)], T_A[Boolean]]]
case class CC_C[D, E](a: Boolean, b: T_B[CC_A, D]) extends T_B[E, D]
case class CC_D[F](a: (T_B[CC_A, CC_B],(CC_A,CC_B))) extends T_B[CC_B, F]
case class CC_E[G, H](a: T_A[CC_A], b: T_A[G]) extends T_B[G, H]

val v_a: T_B[CC_B, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(true, CC_C(_, _)) => 0 
  case CC_C(true, CC_E(_, _)) => 1 
  case CC_C(false, CC_C(_, _)) => 2 
  case CC_C(false, CC_E(_, _)) => 3 
  case CC_D((_,_)) => 4 
}
}
// This is not matched: CC_E(_, _)