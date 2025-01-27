package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Int, b: E) extends T_A[E, D]
case class CC_B[F](a: F, b: (Char,T_A[Char, Boolean])) extends T_A[T_B[(Char,Byte)], F]
case class CC_C(a: (T_A[Boolean, Byte],T_A[(Char,Byte), Int]), b: Int, c: T_A[CC_A[Char, Int], T_B[Boolean]]) extends T_B[T_B[CC_B[Byte]]]
case class CC_D(a: CC_A[CC_B[Char], T_B[CC_C]], b: T_A[T_A[(Int,Int), (Int,Byte)], (CC_C,CC_C)]) extends T_B[T_B[CC_B[Byte]]]

val v_a: T_A[T_B[(Char,Byte)], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, (_,CC_A(_, _))) => 1 
}
}