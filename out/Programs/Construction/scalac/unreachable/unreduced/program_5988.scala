package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (T_A[Int, Int],T_A[Boolean, Byte]), b: T_A[C, C]) extends T_A[C, T_A[((Byte,Int),Boolean), T_A[(Byte,Char), Char]]]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_A[((Byte,Int),Boolean), T_A[(Byte,Char), Char]]]
case class CC_C[F]() extends T_A[T_A[F, CC_A[F, F]], F]

val v_a: T_A[T_A[T_A[((Byte,Int),Boolean), T_A[(Byte,Char), Char]], CC_A[T_A[((Byte,Int),Boolean), T_A[(Byte,Char), Char]], T_A[((Byte,Int),Boolean), T_A[(Byte,Char), Char]]]], T_A[((Byte,Int),Boolean), T_A[(Byte,Char), Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}