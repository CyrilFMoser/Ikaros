package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Int, Int], T_A[Boolean, Char]]]
case class CC_B[D](a: T_A[D, Byte], b: T_A[D, D]) extends T_A[D, T_A[T_A[Int, Int], T_A[Boolean, Char]]]
case class CC_C[E](a: E) extends T_A[E, T_A[T_A[Int, Int], T_A[Boolean, Char]]]

val v_a: T_A[Byte, T_A[T_A[Int, Int], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}