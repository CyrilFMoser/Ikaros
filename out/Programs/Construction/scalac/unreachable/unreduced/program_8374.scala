package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[T_B[T_B[(Char,Int), Byte], T_B[Byte, Char]]]
case class CC_B(a: CC_A[CC_A[Boolean]]) extends T_A[T_B[T_B[(Char,Int), Byte], T_B[Byte, Char]]]
case class CC_C(a: Boolean, b: T_A[T_A[Byte]], c: T_A[(CC_B,Byte)]) extends T_A[T_B[T_B[(Char,Int), Byte], T_B[Byte, Char]]]
case class CC_D[F, E](a: Int, b: T_A[E], c: T_A[E]) extends T_B[E, F]

val v_a: T_A[T_B[T_B[(Char,Int), Byte], T_B[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(CC_A(_))) => 1 
  case CC_C(_, _, _) => 2 
}
}