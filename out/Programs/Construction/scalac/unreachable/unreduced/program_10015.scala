package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, Int], Int]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[CC_A], b: T_B[T_B[CC_A, Int], T_B[CC_A, CC_A]]) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: T_A[Char]) extends T_A[T_A[T_A[Char]]]
case class CC_D[E, D]() extends T_B[D, E]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}