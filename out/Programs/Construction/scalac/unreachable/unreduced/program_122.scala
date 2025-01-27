package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E], c: E) extends T_A[E, T_B[T_B[Boolean, Int], T_B[(Byte,Char), Byte]]]
case class CC_B[F]() extends T_A[F, T_B[T_B[Boolean, Int], T_B[(Byte,Char), Byte]]]
case class CC_C[G](a: (((Byte,Int),Boolean),T_A[Int, Char])) extends T_A[G, T_B[T_B[Boolean, Int], T_B[(Byte,Char), Byte]]]

val v_a: T_A[Byte, T_B[T_B[Boolean, Int], T_B[(Byte,Char), Byte]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,_)) => 1 
}
}
// This is not matched: CC_A(_, _, _)