package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[(Int,(Char,Byte)), T_B[(Int,Byte), Char]], b: T_B[Byte, (Byte,Byte)], c: T_A[T_B[Boolean, Boolean], T_A[Int, Char]]) extends T_A[T_A[T_B[Boolean, Byte], T_B[Char, Int]], (T_A[Int, Int],T_B[(Byte,Int), Byte])]
case class CC_B[E, F](a: T_A[F, E]) extends T_B[E, F]
case class CC_C[H, G](a: Boolean, b: CC_A) extends T_B[H, G]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}