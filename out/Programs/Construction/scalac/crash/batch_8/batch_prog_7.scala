package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: D) extends T_A[D, C]
case class CC_B(a: T_A[T_A[Char, Int], T_A[Byte, Char]], b: T_A[T_A[Int, Int], T_A[Boolean, Byte]], c: T_A[T_A[Boolean, Boolean], T_A[Int, Byte]]) extends T_A[T_A[Int, CC_A[Int, Int]], T_A[Byte, CC_A[(Boolean,Char), Char]]]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
}
}