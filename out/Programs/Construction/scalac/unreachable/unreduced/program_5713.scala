package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[Boolean, Char],T_B[Boolean, Char])) extends T_A[D]
case class CC_B[E](a: T_A[T_B[T_A[Boolean], T_A[Boolean]]]) extends T_A[E]
case class CC_C[G](a: T_A[T_A[G]]) extends T_B[CC_A[T_A[Int]], G]
case class CC_D[H]() extends T_B[CC_A[T_A[Int]], H]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_A((_,_))) => 1 
  case CC_B(CC_B(CC_A(_))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
}
}