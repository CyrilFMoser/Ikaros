package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Char, Int], T_A[Int, Boolean]]]
case class CC_B[D](a: (CC_A[Boolean],T_A[Char, Int]), b: CC_A[D]) extends T_A[D, T_A[T_A[Char, Int], T_A[Int, Boolean]]]
case class CC_C[E](a: E) extends T_A[E, T_A[T_A[Char, Int], T_A[Int, Boolean]]]

val v_a: T_A[Byte, T_A[T_A[Char, Int], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_), _) => 1 
  case CC_C(0) => 2 
  case CC_C(_) => 3 
}
}