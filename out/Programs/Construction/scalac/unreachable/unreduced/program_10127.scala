package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[(Byte,Boolean)], T_B[Char, Boolean]]) extends T_A[T_B[T_A[Int], Byte]]
case class CC_B[D](a: CC_A) extends T_B[T_A[CC_A], D]
case class CC_C[E](a: (Char,Int), b: T_B[T_A[CC_A], E]) extends T_B[T_A[CC_A], E]
case class CC_D[F](a: Int) extends T_B[T_A[CC_A], F]

val v_a: T_B[T_A[CC_A], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C((_,_), CC_B(CC_A(_))) => 1 
  case CC_C((_,_), CC_C(_, _)) => 2 
  case CC_C((_,_), CC_D(12)) => 3 
  case CC_C((_,_), CC_D(_)) => 4 
  case CC_D(_) => 5 
}
}