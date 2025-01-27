package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[D]]
case class CC_B(a: T_A[CC_A[Int], CC_A[Int]], b: CC_A[CC_A[Byte]], c: T_A[(Boolean,Int), CC_A[Char]]) extends T_A[T_A[CC_A[Char], T_A[Int, Char]], T_B[T_A[CC_A[Char], T_A[Int, Char]]]]
case class CC_C[E](a: E, b: (CC_A[CC_B],T_B[(Int,Char)])) extends T_B[E]
case class CC_D[F](a: T_B[(CC_B,CC_B)], b: CC_B, c: Int) extends T_B[F]
case class CC_E(a: T_B[Int], b: T_B[T_B[CC_B]]) extends T_B[T_B[T_B[CC_B]]]

val v_a: T_B[T_A[T_A[CC_A[Char], T_A[Int, Char]], T_B[T_A[CC_A[Char], T_A[Int, Char]]]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
  case CC_C(CC_B(_, _, _), _) => 1 
  case CC_D(CC_C(_, _), _, _) => 2 
  case CC_D(CC_D(_, _, _), _, _) => 3 
}
}