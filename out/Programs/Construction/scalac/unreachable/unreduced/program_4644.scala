package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[T_A[D, T_A[D, D]], D]) extends T_A[E, D]
case class CC_B[G](a: Byte, b: T_B[G]) extends T_A[T_B[(Boolean,Int)], G]
case class CC_C[H](a: ((Boolean,Byte),T_A[Int, Byte])) extends T_A[T_B[(Boolean,Int)], H]
case class CC_D(a: T_B[Byte]) extends T_B[Byte]

val v_a: T_A[T_B[(Boolean,Int)], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_B(0, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(((_,_),CC_A(_))) => 3 
}
}