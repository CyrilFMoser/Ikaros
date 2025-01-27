package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[T_A[Byte, (Char,Char)]], D]
case class CC_B[E]() extends T_A[T_B[T_A[Byte, (Char,Char)]], E]
case class CC_C[F](a: (CC_B[Boolean],T_A[Char, Char])) extends T_A[T_B[T_A[Byte, (Char,Char)]], F]
case class CC_D[G](a: CC_B[G], b: G, c: G) extends T_B[G]

val v_a: T_A[T_B[T_A[Byte, (Char,Char)]], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C((CC_B(),_)) => 2 
}
}