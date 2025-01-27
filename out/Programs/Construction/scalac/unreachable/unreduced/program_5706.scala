package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, Char], T_A[Int, Char]]]
case class CC_B[D](a: D) extends T_A[D, T_A[T_A[Byte, Char], T_A[Int, Char]]]
case class CC_C[E](a: T_A[E, E], b: E) extends T_A[E, T_A[T_A[Byte, Char], T_A[Int, Char]]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Char], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}