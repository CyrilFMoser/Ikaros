package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[(Boolean,Byte)]]]
case class CC_B[D, E](a: T_B[D, E]) extends T_B[D, E]
case class CC_C[F](a: F) extends T_B[F, T_B[T_B[CC_A, Char], Char]]
case class CC_D[G](a: T_B[G, CC_B[G, G]], b: G, c: T_A[CC_C[G]]) extends T_B[G, T_B[T_B[CC_A, Char], Char]]

val v_a: T_B[T_A[T_A[T_A[(Boolean,Byte)]]], T_B[T_B[CC_A, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_))) => 1 
  case CC_B(CC_B(CC_D(_, _, _))) => 2 
  case CC_B(CC_C(_)) => 3 
  case CC_B(CC_D(_, _, _)) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_D(_, CC_A(), _)