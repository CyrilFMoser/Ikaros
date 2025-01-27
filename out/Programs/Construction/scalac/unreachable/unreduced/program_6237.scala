package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, T_B[D]]
case class CC_B(a: T_A[Byte, T_B[Byte]], b: Byte, c: T_B[CC_A[Int]]) extends T_A[T_A[T_A[Byte, Int], T_B[T_A[Byte, Int]]], T_B[T_A[T_A[Byte, Int], T_B[T_A[Byte, Int]]]]]
case class CC_C[E](a: Int, b: T_B[E]) extends T_A[E, T_B[E]]

val v_a: T_A[T_A[T_A[Byte, Int], T_B[T_A[Byte, Int]]], T_B[T_A[T_A[Byte, Int], T_B[T_A[Byte, Int]]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _, _) => 1 
  case CC_B(CC_C(_, _), _, _) => 2 
  case CC_C(_, _) => 3 
}
}