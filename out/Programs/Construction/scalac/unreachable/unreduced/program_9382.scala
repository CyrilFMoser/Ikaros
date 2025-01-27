package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: ((Char,Int),Char), c: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[T_A[T_A[Boolean]]]) extends T_A[D]
case class CC_C[F](a: T_A[F], b: Char, c: T_A[F]) extends T_A[F]
case class CC_D(a: T_B[Boolean], b: T_B[CC_B[Byte]]) extends T_B[CC_A[T_B[Int]]]
case class CC_E(a: T_A[T_A[CC_D]], b: (T_A[CC_D],T_A[CC_D])) extends T_B[T_A[Char]]
case class CC_F(a: T_B[T_A[CC_D]]) extends T_B[CC_A[T_B[Int]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,_),_), _) => 0 
  case CC_B(CC_A(CC_A(_, _, _), (_,_), _)) => 1 
  case CC_B(CC_A(CC_B(_), (_,_), _)) => 2 
  case CC_B(CC_A(CC_C(_, _, _), (_,_), _)) => 3 
  case CC_B(CC_B(CC_A(_, _, _))) => 4 
  case CC_B(CC_B(CC_B(_))) => 5 
  case CC_B(CC_B(CC_C(_, _, _))) => 6 
  case CC_B(CC_C(CC_A(_, _, _), _, CC_A(_, _, _))) => 7 
  case CC_B(CC_C(CC_A(_, _, _), _, CC_B(_))) => 8 
  case CC_B(CC_C(CC_A(_, _, _), _, CC_C(_, _, _))) => 9 
  case CC_B(CC_C(CC_B(_), _, CC_A(_, _, _))) => 10 
  case CC_B(CC_C(CC_B(_), _, CC_B(_))) => 11 
  case CC_B(CC_C(CC_B(_), _, CC_C(_, _, _))) => 12 
  case CC_B(CC_C(CC_C(_, _, _), _, CC_A(_, _, _))) => 13 
  case CC_B(CC_C(CC_C(_, _, _), _, CC_B(_))) => 14 
  case CC_B(CC_C(CC_C(_, _, _), _, CC_C(_, _, _))) => 15 
  case CC_C(_, _, CC_A(_, _, _)) => 16 
  case CC_C(_, _, CC_B(CC_A(_, _, _))) => 17 
  case CC_C(_, _, CC_B(CC_B(_))) => 18 
  case CC_C(_, _, CC_B(CC_C(_, _, _))) => 19 
  case CC_C(_, _, CC_C(_, _, _)) => 20 
}
}