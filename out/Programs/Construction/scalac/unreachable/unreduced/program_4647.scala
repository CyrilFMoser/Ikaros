package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: T_A[T_B[T_A[Char], T_A[Char]]]) extends T_A[D]
case class CC_B[F](a: Char) extends T_A[F]
case class CC_C(a: T_A[((Int,Boolean),Int)]) extends T_A[CC_A[Byte]]
case class CC_D[G]() extends T_B[T_A[CC_A[CC_C]], G]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_A(_, _, CC_A(_, _, _))) => 2 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_A(_, _, CC_A(_, _, _))) => 3 
  case CC_A(_, CC_B(_), CC_A(_, _, CC_A(_, _, _))) => 4 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, CC_B(_))) => 5 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_A(_, _, CC_B(_))) => 6 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_A(_, _, CC_B(_))) => 7 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_A(_, _, CC_B(_))) => 8 
  case CC_A(_, CC_B(_), CC_A(_, _, CC_B(_))) => 9 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_B(_)) => 10 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), CC_B(_)) => 11 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), CC_B(_)) => 12 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), CC_B(_)) => 13 
  case CC_A(_, CC_B(_), CC_B(_)) => 14 
  case CC_B(_) => 15 
}
}