package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_B[(Char,Int)], c: Boolean) extends T_A[C]
case class CC_B[D](a: T_A[D], b: D) extends T_A[D]
case class CC_C(a: Char, b: T_A[Byte]) extends T_A[CC_A[(Int,Int)]]
case class CC_D(a: CC_B[Boolean], b: T_A[(CC_C,(Char,Boolean))], c: CC_A[Byte]) extends T_B[Byte]
case class CC_E(a: T_A[T_A[CC_D]], b: Int, c: T_A[CC_C]) extends T_B[Byte]
case class CC_F(a: T_A[T_A[(Int,Byte)]], b: T_B[Byte]) extends T_B[Byte]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_E(CC_A(_, _, _), _, CC_B(_, _)) => 1 
  case CC_E(CC_B(_, CC_A(_, _, _)), _, CC_A(_, _, _)) => 2 
  case CC_E(CC_B(_, CC_A(_, _, _)), _, CC_B(_, _)) => 3 
  case CC_E(CC_B(_, CC_B(_, _)), _, CC_A(_, _, _)) => 4 
  case CC_E(CC_B(_, CC_B(_, _)), _, CC_B(_, _)) => 5 
}
}