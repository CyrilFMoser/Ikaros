package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[(Byte,Boolean), Char], T_A[Char]], b: Byte, c: (T_B[Byte, Char],Byte)) extends T_A[T_A[T_B[Boolean, Int]]]
case class CC_B(a: CC_A, b: ((CC_A,(Int,Int)),(CC_A,CC_A)), c: (T_A[CC_A],(CC_A,CC_A))) extends T_A[T_A[T_B[Boolean, Int]]]
case class CC_C[D, E]() extends T_B[D, E]
case class CC_D[G, F](a: T_A[F], b: T_B[G, F], c: CC_C[F, G]) extends T_B[F, G]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}