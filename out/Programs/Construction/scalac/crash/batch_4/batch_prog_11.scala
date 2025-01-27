package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_B[Char],T_A[(Byte,Int)])) extends T_A[C]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C(a: T_A[Byte]) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_D[E](a: CC_C) extends T_B[E]
case class CC_E[F]() extends T_B[F]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_),CC_A(_))) => 0 
  case CC_A((CC_D(_),CC_B(_))) => 1 
  case CC_A((CC_E(),CC_A(_))) => 2 
  case CC_A((CC_E(),CC_B(_))) => 3 
  case CC_B(CC_A((_,_))) => 4 
  case CC_B(CC_B(_)) => 5 
}
}