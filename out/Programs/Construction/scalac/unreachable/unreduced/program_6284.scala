package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[T_A[(Int,Byte), Char], T_A[(Int,Byte), Char]], T_A[(Int,Byte), Char]], c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[E]() extends T_A[T_A[E, E], E]
case class CC_C[F](a: ((Char,Boolean),CC_A[Int]), b: T_A[T_A[CC_B[F], CC_B[F]], CC_B[F]], c: F) extends T_A[T_A[T_A[CC_A[Boolean], CC_B[Int]], T_A[CC_A[Boolean], CC_B[Int]]], T_A[CC_A[Boolean], CC_B[Int]]]

val v_a: T_A[T_A[T_A[CC_A[Boolean], CC_B[Int]], T_A[CC_A[Boolean], CC_B[Int]]], T_A[CC_A[Boolean], CC_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, CC_B(), CC_A(_, _, _)), CC_A(_, _, _)) => 1 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B()), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_A(_, CC_B(), CC_B()), CC_A(_, _, _)) => 3 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 4 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_B()) => 5 
  case CC_A(_, CC_A(_, CC_B(), CC_A(_, _, _)), CC_B()) => 6 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B()), CC_B()) => 7 
  case CC_A(_, CC_A(_, CC_B(), CC_B()), CC_B()) => 8 
  case CC_A(_, CC_B(), CC_B()) => 9 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_C(_, _, _)) => 10 
  case CC_A(_, CC_A(_, CC_B(), CC_A(_, _, _)), CC_C(_, _, _)) => 11 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B()), CC_C(_, _, _)) => 12 
  case CC_A(_, CC_A(_, CC_B(), CC_B()), CC_C(_, _, _)) => 13 
  case CC_A(_, CC_B(), CC_C(_, _, _)) => 14 
  case CC_B() => 15 
  case CC_C(((_,_),CC_A(_, _, _)), _, _) => 16 
}
}