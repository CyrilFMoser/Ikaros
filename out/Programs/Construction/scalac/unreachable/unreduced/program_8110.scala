package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[D], b: CC_A[D]) extends T_A[D, T_A[D, D]]
case class CC_C[E]() extends T_A[E, T_A[CC_A[T_B], (T_B,T_B)]]
case class CC_D(a: T_A[CC_C[T_B], T_A[T_B, T_B]], b: T_A[((Boolean,Int),(Boolean,Char)), T_A[((Boolean,Int),(Boolean,Char)), ((Boolean,Int),(Boolean,Char))]]) extends T_B
case class CC_E(a: T_A[CC_A[T_B], T_A[CC_A[T_B], CC_A[T_B]]], b: (CC_A[CC_D],Int)) extends T_B
case class CC_F[F](a: F, b: F, c: T_A[F, F]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(CC_D(_, _))) => 0 
  case CC_D(_, CC_A(CC_E(_, _))) => 1 
  case CC_D(_, CC_A(CC_F(_, _, _))) => 2 
  case CC_D(_, CC_B(CC_A(_), _)) => 3 
  case CC_E(_, _) => 4 
  case CC_F(_, _, _) => 5 
}
}