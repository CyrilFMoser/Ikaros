package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_B[Boolean]]) extends T_A[D, T_B[Boolean]]
case class CC_B(a: T_A[CC_A[Boolean], T_B[Boolean]], b: T_B[CC_A[Boolean]], c: T_B[CC_A[Byte]]) extends T_A[T_A[T_B[(Char,Int)], T_B[Boolean]], T_B[Boolean]]
case class CC_C[E](a: CC_A[CC_B], b: CC_B) extends T_A[E, T_B[Boolean]]
case class CC_D[F](a: F, b: T_A[T_B[F], T_B[Boolean]], c: (T_A[CC_B, CC_B],CC_B)) extends T_B[F]
case class CC_E[G](a: T_B[G]) extends T_B[G]

val v_a: T_A[T_A[T_B[(Char,Int)], T_B[Boolean]], T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B(CC_A(_), _, CC_D(_, _, _))) => 3 
  case CC_A(CC_B(CC_A(_), _, CC_E(_))) => 4 
  case CC_A(CC_B(CC_C(_, _), _, CC_D(_, _, _))) => 5 
  case CC_A(CC_B(CC_C(_, _), _, CC_E(_))) => 6 
  case CC_A(CC_C(_, _)) => 7 
  case CC_B(_, _, CC_D(_, _, (_,_))) => 8 
  case CC_B(_, _, CC_E(_)) => 9 
  case CC_C(_, _) => 10 
}
}