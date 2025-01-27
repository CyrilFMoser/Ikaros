package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E, F]() extends T_A[E, T_A[T_A[Boolean, Byte], T_A[Char, Boolean]]]

val v_a: T_A[Int, T_A[T_A[Boolean, Byte], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
}
}