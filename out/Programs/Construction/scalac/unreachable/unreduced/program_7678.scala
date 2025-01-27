package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Boolean, Byte], b: Char) extends T_A[((Int,Boolean),T_B[Boolean, Int]), T_A[T_B[Boolean, (Byte,Int)], T_B[Char, Char]]]
case class CC_B[E](a: T_B[E, E]) extends T_A[((Int,Boolean),T_B[Boolean, Int]), T_A[T_B[Boolean, (Byte,Int)], T_B[Char, Char]]]
case class CC_C() extends T_A[((Int,Boolean),T_B[Boolean, Int]), T_A[T_B[Boolean, (Byte,Int)], T_B[Char, Char]]]

val v_a: T_A[((Int,Boolean),T_B[Boolean, Int]), T_A[T_B[Boolean, (Byte,Int)], T_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}