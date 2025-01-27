package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, C], b: T_A[D, C], c: T_A[D, T_A[Boolean, Boolean]]) extends T_A[D, C]
case class CC_B[E](a: T_A[E, E]) extends T_A[T_A[T_A[Boolean, (Byte,Int)], ((Boolean,Int),Char)], E]
case class CC_C[F]() extends T_A[T_A[T_A[Boolean, (Byte,Int)], ((Boolean,Int),Char)], F]

val v_a: T_A[T_A[T_A[Boolean, (Byte,Int)], ((Boolean,Int),Char)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 1 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_C()) => 2 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_A(_, _, _)), CC_A(_, _, _)) => 3 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 4 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_A(_, _, _)), CC_C()) => 5 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_C(), CC_A(_, _, _)), CC_A(_, _, _)) => 6 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_C(), CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 7 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_C(), CC_A(_, _, _)), CC_C()) => 8 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_)), CC_A(_, _, _)) => 9 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_)), CC_B(CC_A(_, _, _))) => 10 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_)), CC_C()) => 11 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_B(_)), CC_A(_, _, _)) => 12 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_B(_)), CC_B(CC_A(_, _, _))) => 13 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_B(_)), CC_C()) => 14 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_C(), CC_B(_)), CC_A(_, _, _)) => 15 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_C(), CC_B(_)), CC_B(CC_A(_, _, _))) => 16 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_C(), CC_B(_)), CC_C()) => 17 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_C()), CC_A(_, _, _)) => 18 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_C()), CC_B(CC_A(_, _, _))) => 19 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_C()), CC_C()) => 20 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_C()), CC_A(_, _, _)) => 21 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_C()), CC_B(CC_A(_, _, _))) => 22 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_B(_), CC_C()), CC_C()) => 23 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_C(), CC_C()), CC_A(_, _, _)) => 24 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_C(), CC_C()), CC_B(CC_A(_, _, _))) => 25 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), CC_C(), CC_C()), CC_C()) => 26 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_B(CC_A(_, _, _)), CC_A(_, _, _)) => 27 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_B(CC_A(_, _, _)), CC_B(CC_A(_, _, _))) => 28 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_B(CC_A(_, _, _)), CC_C()) => 29 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_C(), CC_A(_, _, _)) => 30 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_C(), CC_B(CC_A(_, _, _))) => 31 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_C(), CC_C()) => 32 
  case CC_B(_) => 33 
  case CC_C() => 34 
}
}