package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: T_B[D, D], c: T_A[D]) extends T_A[T_B[(Byte,Int), (Int,Boolean)]]
case class CC_B(a: (T_A[Char],T_A[Int])) extends T_A[T_B[(Byte,Int), (Int,Boolean)]]
case class CC_C[F, E]() extends T_B[E, F]

val v_a: T_A[T_B[(Byte,Int), (Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,_)) => 1 
}
}