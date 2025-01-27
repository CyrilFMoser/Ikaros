package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_A[(Boolean,Int)],T_B[Int, Byte])) extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_A[F]
case class CC_D[G]() extends T_B[G, T_A[G]]
case class CC_E[H](a: H, b: CC_C[H], c: H) extends T_B[H, T_A[H]]
case class CC_F(a: T_B[CC_C[Int], T_A[CC_C[Int]]], b: CC_E[(Boolean,Byte)]) extends T_B[T_A[T_B[Int, Char]], T_A[T_A[T_B[Int, Char]]]]

val v_a: T_A[T_B[T_A[T_B[Int, Char]], T_A[T_A[T_B[Int, Char]]]]] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),_)) => 0 
  case CC_A((CC_B(_),_)) => 1 
  case CC_A((CC_C(_),_)) => 2 
  case CC_B(_) => 3 
  case CC_C(CC_A(_)) => 4 
  case CC_C(CC_B(_)) => 5 
  case CC_C(CC_C(_)) => 6 
}
}