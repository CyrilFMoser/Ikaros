package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Boolean]
case class CC_B[F]() extends T_A[F, Boolean]
case class CC_C[G](a: T_A[G, G], b: T_A[G, G], c: (T_A[Boolean, Boolean],T_A[(Boolean,Int), Boolean])) extends T_B[CC_B[T_A[Boolean, Boolean]], G]
case class CC_D[H, I]() extends T_B[I, H]
case class CC_E(a: CC_B[T_A[Int, Boolean]], b: (CC_C[Char],T_B[Boolean, Byte]), c: T_A[T_A[Byte, Boolean], Boolean]) extends T_B[CC_B[T_A[Boolean, Boolean]], CC_D[T_A[Int, Char], Int]]

val v_a: T_B[CC_B[T_A[Boolean, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _, (CC_A(),CC_A())) => 0 
  case CC_C(_, _, (CC_A(),CC_B())) => 1 
  case CC_C(_, _, (CC_B(),CC_B())) => 2 
  case CC_D() => 3 
}
}
// This is not matched: CC_C(_, _, (CC_B(),CC_A()))