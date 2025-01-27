package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: T_B[D], c: (Byte,Boolean)) extends T_A[D, T_B[T_B[Boolean]]]
case class CC_B[E](a: (T_B[Boolean],T_A[Int, Int])) extends T_B[E]
case class CC_C[F]() extends T_B[F]
case class CC_D[G, H]() extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C() => 1 
  case CC_D() => 2 
}
}