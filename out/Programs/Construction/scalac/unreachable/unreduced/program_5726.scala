package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[Int, T_B[Char, T_A[Boolean, Boolean]]]
case class CC_B() extends T_A[Int, T_B[Char, T_A[Boolean, Boolean]]]
case class CC_C[F, E](a: (T_B[CC_A, CC_B],CC_B), b: (CC_A,Byte)) extends T_A[F, E]
case class CC_D[G](a: T_A[T_B[G, G], G]) extends T_B[G, T_A[G, G]]
case class CC_E(a: T_B[T_A[CC_B, (Int,Int)], CC_D[CC_A]]) extends T_B[CC_A, CC_D[(CC_A,Char)]]

val v_a: T_A[Int, T_B[Char, T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C((_,CC_B()), (CC_A(),_)) => 2 
}
}