package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_B[Byte]], c: T_B[T_B[Boolean]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_B[T_B[(Char,Byte)]], b: T_B[Boolean], c: T_B[((Byte,Char),Char)]) extends T_B[T_B[T_B[CC_A]]]
case class CC_C(a: T_A[T_B[CC_B]], b: T_B[CC_B]) extends T_B[T_B[T_B[CC_A]]]
case class CC_D(a: Int) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_) => 2 
}
}