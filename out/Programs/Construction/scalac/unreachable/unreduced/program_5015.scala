package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_B[T_B[Byte, Char], T_A[Int]]]
case class CC_B() extends T_A[T_B[T_B[Byte, Char], T_A[Int]]]
case class CC_C(a: (Char,T_A[Int]), b: Int, c: T_B[CC_B, Boolean]) extends T_A[T_B[T_B[Byte, Char], T_A[Int]]]
case class CC_D[E, F]() extends T_B[E, F]

val v_a: T_A[T_B[T_B[Byte, Char], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C((_,_), _, CC_D()) => 2 
}
}