package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[(Boolean,(Byte,Int)), Int], b: ((Boolean,Char),T_B[Byte, Int])) extends T_A[Char, T_A[T_A[Byte, Char], T_A[Byte, (Byte,Int)]]]
case class CC_B[F, E](a: Byte, b: T_B[F, F]) extends T_B[E, F]
case class CC_C(a: CC_A, b: Int, c: T_A[T_B[CC_A, CC_A], T_B[CC_A, CC_A]]) extends T_B[T_B[T_B[CC_A, CC_A], (CC_A,CC_A)], CC_A]

val v_a: T_B[T_B[T_B[CC_A, CC_A], (CC_A,CC_A)], CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_C(_, _, _) => 1 
}
}