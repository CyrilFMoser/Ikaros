package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Byte,Byte), T_A[Boolean, Char]], b: T_A[T_A[Int, Boolean], T_A[Int, Boolean]]) extends T_A[T_A[T_A[Int, Byte], Char], T_A[T_A[Char, Char], Boolean]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Int, Byte], Char], T_A[T_A[Char, Char], Boolean]]

val v_a: T_A[T_A[T_A[Int, Byte], Char], T_A[T_A[Char, Char], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}