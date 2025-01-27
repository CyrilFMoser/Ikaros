package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Int, Int], T_A[(Char,Boolean), Int]]]
case class CC_B[D](a: T_A[D, D], b: T_A[Byte, D]) extends T_A[D, T_A[T_A[Int, Int], T_A[(Char,Boolean), Int]]]

val v_a: T_A[Char, T_A[T_A[Int, Int], T_A[(Char,Boolean), Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}