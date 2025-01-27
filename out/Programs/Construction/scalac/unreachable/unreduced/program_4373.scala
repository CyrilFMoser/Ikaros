package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: CC_A[E]) extends T_B[(Int,CC_A[(Int,Byte)]), T_A[T_A[Boolean]]]
case class CC_C(a: T_B[CC_B[(Int,Int)], T_A[Byte]]) extends T_B[(Int,CC_A[(Int,Byte)]), T_A[T_A[Boolean]]]

val v_a: T_B[(Int,CC_A[(Int,Byte)]), T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
}
}