package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, (T_A[Int, Char],T_A[(Byte,Byte), Byte])]
case class CC_B[D](a: D, b: CC_A[D], c: T_A[D, D]) extends T_A[D, (T_A[Int, Char],T_A[(Byte,Byte), Byte])]
case class CC_C[E, F](a: (CC_A[Char],Boolean), b: Int) extends T_A[E, (T_A[Int, Char],T_A[(Byte,Byte), Byte])]

val v_a: T_A[Int, (T_A[Int, Char],T_A[(Byte,Byte), Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}