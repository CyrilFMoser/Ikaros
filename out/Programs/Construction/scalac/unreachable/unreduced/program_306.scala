package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, Char]
case class CC_B[D](a: T_A[D, Char], b: T_A[D, Char], c: T_A[D, Char]) extends T_A[D, Char]
case class CC_C(a: CC_B[T_A[Char, Char]], b: Int) extends T_A[T_A[T_A[Boolean, Char], T_A[(Int,Byte), Byte]], Char]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[(Int,Byte), Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_B(_, _, _), _) => 2 
}
}