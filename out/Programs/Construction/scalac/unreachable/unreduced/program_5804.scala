package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Int],(Int,Char))) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: Boolean) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, CC_A[E]], b: E) extends T_A[T_A[T_A[Boolean, Char], Char], E]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(_, _) => 1 
}
}