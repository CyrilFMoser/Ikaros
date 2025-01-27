package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[Int, Boolean], b: T_A[T_B[Int, Int], T_A[Boolean, Char]], c: T_A[T_A[Char, Int], T_A[Boolean, Byte]]) extends T_A[Byte, T_A[T_B[Int, (Int,Boolean)], T_A[Byte, Byte]]]
case class CC_B(a: T_A[Char, T_A[CC_A, Boolean]], b: (T_A[CC_A, CC_A],CC_A), c: T_B[T_B[CC_A, CC_A], Int]) extends T_A[Byte, T_A[T_B[Int, (Int,Boolean)], T_A[Byte, Byte]]]
case class CC_C[E]() extends T_A[Byte, T_A[T_B[Int, (Int,Boolean)], T_A[Byte, Byte]]]
case class CC_D[F, G]() extends T_B[F, G]

val v_a: T_A[Byte, T_A[T_B[Int, (Int,Boolean)], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}