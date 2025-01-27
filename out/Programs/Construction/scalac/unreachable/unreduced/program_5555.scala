package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D], b: T_A[E, E]) extends T_A[E, D]
case class CC_B[F](a: F) extends T_A[F, T_A[T_A[(Byte,Char), Char], (Boolean,Byte)]]
case class CC_C[G](a: Boolean, b: T_A[G, G]) extends T_B[T_A[(Boolean,Int), T_A[Boolean, Int]]]
case class CC_D(a: CC_B[T_A[Boolean, Int]], b: T_A[(Int,Byte), T_A[Int, (Char,Int)]], c: T_B[CC_C[(Char,Byte)]]) extends T_B[T_A[(Boolean,Int), T_A[Boolean, Int]]]
case class CC_E(a: T_A[CC_B[CC_D], Byte]) extends T_B[CC_B[CC_D]]

val v_a: T_A[Int, T_A[T_A[(Byte,Char), Char], (Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_B(_) => 1 
}
}