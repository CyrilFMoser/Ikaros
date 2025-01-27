package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, Char]) extends T_A[T_A[(Boolean,Int), T_B[Char, Boolean]], E]
case class CC_B[F]() extends T_A[T_A[(Boolean,Int), T_B[Char, Boolean]], F]
case class CC_C[G](a: CC_B[G]) extends T_B[CC_B[(Int,(Boolean,Int))], T_A[T_B[Boolean, Char], CC_A[Int]]]
case class CC_D[H, I](a: T_A[H, H], b: (T_B[Boolean, Boolean],Char)) extends T_B[H, I]

val v_a: T_A[T_A[(Boolean,Int), T_B[Char, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, (_,_))) => 0 
  case CC_B() => 1 
}
}