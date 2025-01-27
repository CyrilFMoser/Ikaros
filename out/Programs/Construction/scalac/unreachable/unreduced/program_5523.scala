package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Boolean],T_A[Boolean])) extends T_A[T_B[(Int,(Boolean,Byte)), T_B[Int, Char]]]
case class CC_B(a: CC_A) extends T_A[T_B[(Int,(Boolean,Byte)), T_B[Int, Char]]]
case class CC_C[D](a: CC_A, b: D) extends T_B[Byte, D]
case class CC_D[F, E](a: Char) extends T_B[E, F]
case class CC_E[G](a: T_A[G]) extends T_B[Byte, G]

val v_a: T_A[T_B[(Int,(Boolean,Byte)), T_B[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
}
}