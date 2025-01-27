package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: CC_A[E], c: Int) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_A[T_A[F]]) extends T_B[F, T_A[Boolean]]
case class CC_D[G, H](a: H, b: H) extends T_B[G, T_A[Boolean]]
case class CC_E[I, J](a: (T_B[Byte, (Char,Boolean)],Int), b: T_B[I, T_A[Boolean]], c: ((Int,Int),Int)) extends T_B[Char, I]

val v_a: T_B[Char, T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _) => 1 
  case CC_E(_, CC_C(CC_A(_, _, _), CC_A(_, _, _)), ((_,_),_)) => 2 
  case CC_E(_, CC_C(CC_A(_, _, _), CC_B(_, _, _)), ((_,_),_)) => 3 
  case CC_E(_, CC_C(CC_B(_, _, _), CC_A(_, _, _)), ((_,_),_)) => 4 
  case CC_E(_, CC_C(CC_B(_, _, _), CC_B(_, _, _)), ((_,_),_)) => 5 
}
}
// This is not matched: CC_E(_, CC_D(_, _), ((_,_),_))