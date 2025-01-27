package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (Boolean,T_B[Int]), b: D, c: T_A[D, D]) extends T_A[T_A[D, (Byte,Int)], D]
case class CC_B[E]() extends T_A[T_A[E, (Byte,Int)], E]
case class CC_C[F]() extends T_A[T_A[F, (Byte,Int)], F]
case class CC_D[G]() extends T_B[G]

val v_a: T_A[T_A[Byte, (Byte,Int)], Byte] = null
val v_b: Int = v_a match{
  case CC_A((true,CC_D()), _, _) => 0 
  case CC_A((false,CC_D()), _, _) => 1 
  case CC_B() => 2 
  case CC_C() => 3 
}
}