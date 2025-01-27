package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, Int]) extends T_A[E, Int]
case class CC_B() extends T_A[CC_A[T_A[Int, Boolean]], Int]
case class CC_C[G, F](a: (Byte,T_A[CC_B, CC_B])) extends T_A[G, F]
case class CC_D[H](a: CC_C[H, H]) extends T_B[Byte, H]
case class CC_E[I](a: Byte, b: I) extends T_B[Byte, I]

val v_a: T_A[CC_A[T_A[Int, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B()) => 1 
  case CC_A(_, CC_C((_,_))) => 2 
  case CC_C((0,CC_C(_))) => 3 
  case CC_C((_,CC_C(_))) => 4 
}
}
// This is not matched: CC_B()