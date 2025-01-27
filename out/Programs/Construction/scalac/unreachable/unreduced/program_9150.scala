package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (Int,T_A[Int, Char])) extends T_A[C, Int]
case class CC_B[E]() extends T_A[E, Int]
case class CC_C[F](a: Byte, b: F) extends T_A[F, T_A[F, Int]]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
}
}