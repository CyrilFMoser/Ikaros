package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: E, c: E) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D(a: T_A[T_B[Boolean, Boolean]], b: T_B[T_A[Char], CC_C[Boolean]], c: (Byte,T_B[Byte, Byte])) extends T_B[Int, T_A[CC_A[(Char,Int)]]]
case class CC_E[G, H](a: G) extends T_B[G, T_A[G]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C())) => 2 
  case CC_A(CC_B(CC_A(_), CC_D(_, _, _), CC_D(_, _, _))) => 3 
  case CC_A(CC_B(CC_B(_, _, _), CC_D(_, _, _), CC_D(_, _, _))) => 4 
  case CC_A(CC_B(CC_C(), CC_D(_, _, _), CC_D(_, _, _))) => 5 
  case CC_A(CC_C()) => 6 
  case CC_B(_, _, CC_D(CC_A(_), _, (_,_))) => 7 
  case CC_B(_, _, CC_D(CC_B(_, _, _), _, (_,_))) => 8 
  case CC_B(_, _, CC_D(CC_C(), _, (_,_))) => 9 
  case CC_C() => 10 
}
}