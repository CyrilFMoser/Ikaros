package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Int], T_A[Char, Char]], b: T_A[T_A[(Int,Byte), (Char,Boolean)], T_A[Int, Boolean]]) extends T_A[T_A[T_A[Boolean, Char], T_A[(Byte,Boolean), Boolean]], T_A[T_A[Int, Byte], T_A[Boolean, Char]]]
case class CC_B[D, C](a: D, b: T_A[C, D], c: T_A[C, C]) extends T_A[C, D]
case class CC_C(a: CC_B[T_A[CC_A, Int], T_A[CC_A, CC_A]], b: CC_A) extends T_A[T_A[T_A[Boolean, Char], T_A[(Byte,Boolean), Boolean]], T_A[T_A[Int, Byte], T_A[Boolean, Char]]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}