package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_A[T_B, C], c: Int) extends T_A[T_B, C]
case class CC_B[D](a: D, b: (T_B,(T_B,T_B))) extends T_A[T_B, T_A[(T_B,T_B), Byte]]
case class CC_C(a: T_B, b: T_A[Char, Char]) extends T_A[T_B, Int]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_C(_, _), _) => 1 
}
}