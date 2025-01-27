package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Int], T_B[Char, Boolean]], b: T_A[T_A[Byte]]) extends T_A[T_A[T_B[Char, Char]]]
case class CC_B(a: T_B[T_B[CC_A, CC_A], T_B[CC_A, CC_A]]) extends T_A[T_A[T_B[Char, Char]]]
case class CC_C[E, D](a: CC_A, b: CC_A, c: (CC_A,Boolean)) extends T_B[E, D]
case class CC_D[G, F]() extends T_B[G, F]

val v_a: T_B[Boolean, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_D(), _), CC_A(_, _), _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C(CC_A(CC_C(_, _, _), _), CC_A(_, _), _)